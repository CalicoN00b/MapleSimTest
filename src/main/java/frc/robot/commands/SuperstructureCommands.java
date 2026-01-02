package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.subsystems.drive.Drive;
import org.ironmaple.simulation.drivesims.SwerveDriveSimulation;

public class SuperstructureCommands {

    public static Command scoreRightL4Sim(Drive drive, SwerveDriveSimulation driveSimulation) {
        return Commands.sequence(
                Commands.deadline(Commands.waitSeconds(1), DriveCommands.alignToReef(drive, false)),
                Commands.waitSeconds(0.1),
                IntakeCommands.scoreL4Sim(driveSimulation));
    }

    public static Command scoreLeftL4Sim(Drive drive, SwerveDriveSimulation driveSimulation) {
        return Commands.sequence(
                Commands.deadline(Commands.waitSeconds(1), DriveCommands.alignToReef(drive, true)),
                Commands.waitSeconds(0.1),
                IntakeCommands.scoreL4Sim(driveSimulation));
    }

    public static Command scoreRightL3Sim(Drive drive, SwerveDriveSimulation driveSimulation) {
        return Commands.sequence(
                Commands.deadline(Commands.waitSeconds(1), DriveCommands.alignToReef(drive, false)),
                Commands.waitSeconds(0.1),
                IntakeCommands.scoreL3Sim(driveSimulation));
    }

    public static Command scoreLeftL3Sim(Drive drive, SwerveDriveSimulation driveSimulation) {
        return Commands.sequence(
                Commands.deadline(Commands.waitSeconds(1), DriveCommands.alignToReef(drive, true)),
                Commands.waitSeconds(0.1),
                IntakeCommands.scoreL3Sim(driveSimulation));
    }

    public static Command scoreRightL2Sim(Drive drive, SwerveDriveSimulation driveSimulation) {
        return Commands.sequence(
                Commands.deadline(Commands.waitSeconds(1), DriveCommands.alignToReef(drive, false)),
                Commands.waitSeconds(0.1),
                IntakeCommands.scoreL2Sim(driveSimulation));
    }

    public static Command scoreLeftL2Sim(Drive drive, SwerveDriveSimulation driveSimulation) {
        return Commands.sequence(
                Commands.deadline(Commands.waitSeconds(1), DriveCommands.alignToReef(drive, true)),
                Commands.waitSeconds(0.1),
                IntakeCommands.scoreL2Sim(driveSimulation));
    }
}
