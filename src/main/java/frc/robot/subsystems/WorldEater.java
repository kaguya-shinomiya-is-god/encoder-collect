package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class WorldEater extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public WorldEater() {
    VictorSPX msE = new VictorSPX(Constants.kMotorSystemLeft);
    VictorSPX msD = new VictorSPX(Constants.kMotorSystemRight);
    VictorSPX msT = new VictorSPX(Constants.kMotorSystemTransmission);
    msD.follow(msE);
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
