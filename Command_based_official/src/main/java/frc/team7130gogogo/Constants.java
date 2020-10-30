/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team7130gogogo;

import frc.team7130gogogo.subsystems.MotorSubsystem;
import frc.team7130gogogo.subsystems.MotorSubsystem.MotorSubsystemConstants;

frc.team7130gogogo.subsystems.*;/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    //chassis 
    public static final int kLeftDriveMasterId = 11;
    public static final int kLeftDriveSlaveId = 12;
    public static final int kRightDriveMasterId = 13;
    public static final int kRightDriveSlaveId = 14;
    

    // turret 
    public static final MotorSubsystemConstants kTurretConstants = new MotorSubsystemConstants();
    static{
        kTurretConstants.kName = "Turret";
        kTurretConstants.kKp = 0;
        kTurretConstants.kKi = 0;
        kTurretConstants.kKd = 0;
        kTurretConstants.kDeadband = 0;
        kTurretConstants.kIZone= 0;
    }

}
