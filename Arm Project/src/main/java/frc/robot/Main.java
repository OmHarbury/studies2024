// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.RobotBase;

/**
 * Do NOT add any static variables to this class, or any initialization at all. Unless you know what
 * you are doing, do not modify this file except to change the parameter class to the startRobot
 * call.
 */
public final class Main {
  private Main() {}

  /**
   * Main initialization function. Do not perform any initialization here.
   *
   * <p>If you change your main robot class, change the parameter type.
   */
  public static void main(String... args) {
    RobotBase.startRobot(Robot::new);

  }

  // public static void calcAngle(double x, double y){
  //   double q2 = Math.acos((Math.pow(x, 2) + Math.pow(y,2) - Math.pow(144, 2) - Math.pow(185,2))/(2.0*185*144));
  //   double q1 = Math.atan(y/x) - Math.atan((144*Math.sin(q2))/(144+ 185*Math.cos(q2)));
}
