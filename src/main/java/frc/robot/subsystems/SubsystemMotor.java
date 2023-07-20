// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class SubsystemMotor extends SubsystemBase {
 private final CANSparkMax m_motor;
 
 
  /** Creates a new ExampleSubsystem. */
  public SubsystemMotor() {
  m_motor = new CANSparkMax(Constants.motorID, MotorType.kBrushless);
  }

  public void MotorSpin(double speed) {
    m_motor.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
