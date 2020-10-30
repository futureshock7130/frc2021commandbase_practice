package frc.team7130gogogo.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public abstract class MotorSubsystem extends SubsystemBase{
    private static final int kMotionProfileSlot = 0;
    private static final int kPositionPIDSlot = 1;

    // Recommend initializing in a static block!
    public static class TalonSRXConstants {
        public int id = -1;
        public boolean invert_motor = false;
        public boolean invert_sensor_phase = false;
    }

    // Recommend initializing in a static block!
    public static class MotorSubsystemConstants {
        public String kName = "ERROR_ASSIGN_A_NAME";

        public TalonSRXConstants kMasterConstants = new TalonSRXConstants();
        public TalonSRXConstants[] kSlaveConstants = new TalonSRXConstants[0];

        public double kHomePosition = 0.0; // Units
        public double kTicksPerUnitDistance = 1.0;
        public double kKp = 0;  // Raw output / raw error
        public double kKi = 0;  // Raw output / sum of raw error
        public double kKd = 0;  // Raw output / (err - prevErr)
        public double kKf = 0;  // Raw output / velocity in ticks/100ms
        public double kKa = 0;  // Raw output / accel in (ticks/100ms) / s
        public double kMaxIntegralAccumulator = 0;
        public int kIZone = 0; // Ticks
        public int kDeadband = 0; // Ticks

        public double kPositionKp = 0;
        public double kPositionKi = 0;
        public double kPositionKd = 0;
        public double kPositionKf = 0;
        public double kPositionMaxIntegralAccumulator = 0;
        public int kPositionIZone = 0; // Ticks
        public int kPositionDeadband = 0; // Ticks

        public int kCruiseVelocity = 0; // Ticks / 100ms
        public int kAcceleration = 0; // Ticks / 100ms / s
        public double kRampRate = 0.0; // s
        public int kContinuousCurrentLimit = 20; // amps
        public int kPeakCurrentLimit = 60; // amps
        public int kPeakCurrentDuration = 200; // milliseconds
        public double kMaxVoltage = 12.0;

        public double kMaxUnitsLimit = Double.POSITIVE_INFINITY;
        public double kMinUnitsLimit = Double.NEGATIVE_INFINITY;

        public int kStatusFrame8UpdateRate = 1000;
        public boolean kRecoverPositionOnReset = false;
    }

}