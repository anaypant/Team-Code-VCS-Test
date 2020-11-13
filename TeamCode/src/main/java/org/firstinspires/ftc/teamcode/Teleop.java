package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class Teleop extends OpMode {
    DcMotor br;
    DcMotor bl;
    DcMotor fl;
    DcMotor fr;

    public void init() {
        br = hardwareMap.dcMotor.get("br");
        bl = hardwareMap.dcMotor.get("bl");
        fl = hardwareMap.dcMotor.get("fl");
        fr = hardwareMap.dcMotor.get("fr");
    }

    public void loop() {
        br.setPower(gamepad1.right_stick_y);
        bl.setPower(-gamepad1.left_stick_y);
        fl.setPower(-gamepad1.left_stick_y);
        fr.setPower(gamepad1.right_stick_y);
    }
}