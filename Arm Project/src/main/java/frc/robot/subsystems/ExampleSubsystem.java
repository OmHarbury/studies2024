// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import java.util.concurrent.atomic.DoubleAccumulator;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ExampleSubsystem extends SubsystemBase {
  private final Servo m_servo1;
  private final Servo m_servo2;
  private final Servo m_servo3;
  private final Servo m_servo4;
  private final Servo m_servo5;
  private final Servo m_servo6;

public void initialize() {
  m_servo1.set(1);
  m_servo2.set(0);
  m_servo3.set(0);
  m_servo4.set(0);
  m_servo5.set(0);
  m_servo6.set(0); 
}


  /** Creates a new ExampleSubsystem. */
  public ExampleSubsystem() {
    m_servo1=new Servo(0);
    m_servo2=new Servo(1);
    m_servo3=new Servo(2);
    m_servo4=new Servo(3);
    m_servo5=new Servo(4);
    m_servo6=new Servo(5);
}
public static double calcAngle(double x, double y){
  double q2 = Math.acos((Math.pow(x, 2) + Math.pow(y,2) - Math.pow(144.0, 2) - Math.pow(185.0,2))/(2.0*185.0*144.0));
  return (q2/Math.PI);
}


public static double calcAngle2(double x, double y){
  double q1 = Math.atan(y/x) - Math.atan((185.0*Math.sin(Math.acos((Math.pow(x, 2) + Math.pow(y,2) - Math.pow(144.0, 2) - Math.pow(185.0,2))/(2.0*185.0*144.0))))/(144.0+ 185.0*Math.cos(Math.acos((Math.pow(x, 2) + Math.pow(y,2) - Math.pow(144.0, 2) - Math.pow(185.0,2))/(2.0*185.0*144.0)))));
  return (q1/Math.PI); 
}

  /**
   * Example command factory method.
   *
   * @return a command
   */
  public CommandBase inverseKinematics(double valuex, double valuey){
    double th2= calcAngle(valuex, valuey);
    double th1= calcAngle2(valuex, valuey);
    return run(
      () -> {m_servo1.set(th1);
        m_servo2.set(th2);
      }
    );
  }
  public CommandBase exampleMethodCommand1(double value) {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return run(
        () -> {
          m_servo1.set(m_servo1.get()+value);
          /* one-time action goes here */
        });
  }
  public CommandBase exampleMethodCommand10(double value) {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return run(
        () -> {
          m_servo1.set(m_servo1.get()+value);
          m_servo2.set(m_servo2.get()+value);
          /* one-time action goes here */
        });
  }
  public CommandBase exampleMethodCommand2(double value) {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return run(
        () -> {
          m_servo2.set(m_servo2.get()+value);
          /* one-time action goes here */
        });
  }
  public CommandBase exampleMethodCommand3(double value) {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return run(
        () -> {
          m_servo3.set(m_servo3.get()+value);
          /* one-time action goes here */
        });
  }
  public CommandBase exampleMethodCommand4(double value) {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return run(
        () -> {
          m_servo4.set(m_servo4.get()+value);
          /* one-time action goes here */
        });
  }
  public CommandBase exampleMethodCommand5(double value) {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return run(
        () -> {
          m_servo5.set(m_servo5.get()+value);
          /* one-time action goes here */
        });
  }
  public CommandBase exampleMethodCommand6(double value) {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return run(
        () -> {
          m_servo6.set(m_servo6.get()+value);
          System.out.println("Button 6");
          /* one-time action goes here */
        });
  }
  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
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
