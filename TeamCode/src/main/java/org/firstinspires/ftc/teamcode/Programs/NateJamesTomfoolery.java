package org.firstinspires.ftc.teamcode.Programs;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous
public class NateJamesTomfoolery exttends LinearOpMode {

    private DcMotor frontRightMotor, frontLeftMotor, rearRightMotor, rearLeftMotor;
    private ElapsedTime runtime = new ElapsedTime();

    //this is methodic
    private void turnRight()
    {
        frontLeftMotor.setPower(1);
        rearLeftMotor.setPower(1);
        frontRightMotor.setPower((-1));
        rearRightMotor.setPower((-1));
        sleep(500);

    }
    private void turnLeft()
    {
        frontLeftMotor.setPower((-1));
        rearLeftMotor.setPower((-1));
        frontRightMotor.setPower(1);
        rearRightMotor.setPower(1);
        sleep(500);

    }
    private void onward()
    {
        frontLeftMotor.setPower(1);
        rearLeftMotor.setPower(1);
        frontRightMotor.setPower((1);
        rearRightMotor.setPower (1);
        sleep(500);

    }
    private void onward()
    {
        frontLeftMotor.setPower((-1));
        rearLeftMotor.setPower((-1));
        frontRightMotor.setPower((-1));
        rearRightMotor.setPower ((-1));
        sleep(500);

    }
    private void reverseOnward()
    {
        frontLeftMotor.setPower((-1));
        rearLeftMotor.setPower((-1));
        frontRightMotor.setPower((-1));
        rearRightMotor.setPower ((-1));
        sleep(500);

    }
    private void strafeLeft()
    {
        frontLeftMotor.setPower((-1));
        rearLeftMotor.setPower(1);
        frontRightMotor.setPower(1);
        rearRightMotor.setPower ((-1));
        sleep(500);

    }
    private void strafeRight()
    {
        frontLeftMotor.setPower(1);
        rearLeftMotor.setPower((-1));
        frontRightMotor.setPower((-1));
        rearRightMotor.setPower (1);
        sleep(500);

    }

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

        frontLeftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        rearLeftMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        // Wait for the game to start (driver presses PLAY)
        waitForStart();
        runtime.reset();

        // Run until the end of the match (driver presses STOP)
        if (opModeIsActive()) {
            // Drive forward for 1 second

            frontLeftMotor.setPower(0.5);
            frontRightMotor.setPower(0.5);
            rearLeftMotor.setPower(0.5);
            rearRightMotor.setPower(0.5);

            sleep(1000);

            frontLeftMotor.setPower(0);
            frontRightMotor.setPower(0);
            rearLeftMotor.setPower(0);
            rearRightMotor.setPower(0);

            sleep(500); // Brief pause before ending
        }
    }
}