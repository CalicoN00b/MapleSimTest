package frc.robot.commands;

import static edu.wpi.first.units.Units.*;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import org.ironmaple.simulation.SimulatedArena;
import org.ironmaple.simulation.drivesims.SwerveDriveSimulation;
import org.ironmaple.simulation.seasonspecific.reefscape2025.ReefscapeCoralOnFly;

public class IntakeCommands {

    public static Command scoreL3Sim(SwerveDriveSimulation driveSimulation) {
        return Commands.runOnce(() -> SimulatedArena.getInstance()
                .addGamePieceProjectile(new ReefscapeCoralOnFly(
                        driveSimulation.getSimulatedDriveTrainPose().getTranslation(),
                        new Translation2d(0.55, 0),
                        driveSimulation.getDriveTrainSimulatedChassisSpeedsFieldRelative(),
                        driveSimulation.getSimulatedDriveTrainPose().getRotation(),
                        Meters.of(1.33),
                        MetersPerSecond.of(2),
                        Degrees.of(-35))));
    }

    public static Command scoreL4Sim(SwerveDriveSimulation driveSimulation) {
        return Commands.runOnce(() -> SimulatedArena.getInstance()
                .addGamePieceProjectile(new ReefscapeCoralOnFly(
                        driveSimulation.getSimulatedDriveTrainPose().getTranslation(),
                        new Translation2d(0.66, 0),
                        driveSimulation.getDriveTrainSimulatedChassisSpeedsFieldRelative(),
                        driveSimulation.getSimulatedDriveTrainPose().getRotation(),
                        Meters.of(2.1),
                        MetersPerSecond.of(1),
                        Degrees.of(-90))));
    }
}
