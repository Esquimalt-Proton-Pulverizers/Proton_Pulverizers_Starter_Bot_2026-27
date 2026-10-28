package org.firstinspires.ftc.teamcode.Programs;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous
public class Auto_Linear_OpMode extends LinearOpMode {

    private DcMotor frontRightMotor, frontLeftMotor, rearRightMotor, rearLeftMotor;
    private ElapsedTime runtime = new ElapsedTime();

    @Override
    public void runOpMode() throws InterruptedException {
        // Initialize motors
        frontRightMotor = hardwareMap.get(DcMotor.class, "frontRightMotor");
        frontLeftMotor = hardwareMap.get(DcMotor.class, "frontLeftMotor");
        rearRightMotor = hardwareMap.get(DcMotor.class, "rearRightMotor");
        rearLeftMotor = hardwareMap.get(DcMotor.class, "rearLeftMotor");

        // Set motor behaviors
        frontRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rearRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rearLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        // Display initialization status
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        // Wait for the game to start (driver presses PLAY)
        waitForStart();
        runtime.reset();

        // Run until the end of the match (driver presses STOP)
        if (opModeIsActive()) {
            // Drive forward for 1 second
            telemetry.addData("Status", "Driving forward");
            telemetry.update();
            
            frontLeftMotor.setPower(-0.5);
            frontRightMotor.setPower(0.5);
            rearLeftMotor.setPower(-0.5);
            rearRightMotor.setPower(0.5);
            
            sleep(1000);

            // Stop the robot
            telemetry.addData("Status", "Stopping");
            telemetry.update();
            
            frontLeftMotor.setPower(0);
            frontRightMotor.setPower(0);
            rearLeftMotor.setPower(0);
            rearRightMotor.setPower(0);
            
            sleep(500); // Brief pause before ending
        }

        // Display final status
        telemetry.addData("Status", "Autonomous mode complete");
        telemetry.update();
    }
}