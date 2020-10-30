/*start yeeeeeah*/



package frc.team7130gogogo.subsystems;
//import com.ctre.phoenix.*;
import com.ctre.phoenix.motorcontrol.*;
import com.ctre.phoenix.motorcontrol.can.*;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj2.command.*;
import edu.wpi.first.wpilibj.drive.*;
import frc.team7130gogogo.Constants;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
public class drive extends SubsystemBase {
    

    // hard ware 
    public TalonFX mleftMaster=new TalonFX(Constants.kLeftDriveMasterId);
    public TalonFX mrightMaster=new TalonFX(Constants.kRightDriveMasterId);
    public TalonFX mleftslave=new TalonFX(Constants.kLeftDriveSlaveId);
    public TalonFX mrightslave=new TalonFX(Constants.kRightDriveSlaveId);
    private final DifferentialDrive mDrive = new DifferentialDrive(mleftMaster, mrightMaster);

    // 變速箱變換 
     
   
    
    private void Drive() {
        public int chasis_encoder=mleftMaster.getSelectedSensorPosition();
        mleftMaster.setInverted(true);
        mleftslave.setInverted(true);
        mleftslave.follow(mleftMaster);
        mrightslave.follow(mrightMaster);
        mDrive.arcadeDrive(xSpeed, zRotation);
    
    }
}






