package frc.robot;

import edu.wpi.first.apriltag.AprilTagFieldLayout;
import edu.wpi.first.apriltag.AprilTagFields;
import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Translation2d;
import java.util.ArrayList;

/** Just a bunch of measurements of various parts of the field, measured from the blue origin. */
public class FieldConstants {

    public static final AprilTagFieldLayout tagLayout =
            AprilTagFieldLayout.loadField(AprilTagFields.k2025ReefscapeWelded);

    public static final double fieldLength = tagLayout.getFieldLength();
    public static final double fieldWidth = tagLayout.getFieldWidth();
    public static final Translation2d fieldCenter = new Translation2d(fieldLength / 2, fieldWidth / 2);

    public static class Reef {

        // Starting at the A/B side, and rotating clockwise until the C/D side.
        public static ArrayList<Pose2d> tagPositions = new ArrayList<Pose2d>(6);

        static {
            tagPositions.add(tagLayout.getTagPose(18).get().toPose2d());
            tagPositions.add(tagLayout.getTagPose(19).get().toPose2d());
            tagPositions.add(tagLayout.getTagPose(20).get().toPose2d());
            tagPositions.add(tagLayout.getTagPose(21).get().toPose2d());
            tagPositions.add(tagLayout.getTagPose(22).get().toPose2d());
            tagPositions.add(tagLayout.getTagPose(17).get().toPose2d());
        }
    }
}
