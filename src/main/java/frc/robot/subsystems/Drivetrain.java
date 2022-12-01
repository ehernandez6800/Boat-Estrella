package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;



public class Drivetrain extends SubsystemBase {

    CANSparkMax frontRightMotor = new CANSparkMax(1, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax frontLeftMotor = new CANSparkMax(2, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax backRightMotor = new CANSparkMax(3, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax backLeftMotor = new CANSparkMax(4, CANSparkMaxLowLevel.MotorType.kBrushless);

    MotorControllerGroup leftMotors = new MotorControllerGroup(frontLeftMotor, backLeftMotor);
    MotorControllerGroup rightMotors = new MotorControllerGroup(frontRightMotor, backRightMotor);

    DifferentialDrive differentialTankDrive = new DifferentialDrive(leftMotors, rightMotors);



public Drivetrain(){
    leftMotors.setInverted(true);
    rightMotors.setInverted(false);
}

}

public void tankDrive(double left, double right) {
    differentialTankDrive.tankDrive(left, right);

