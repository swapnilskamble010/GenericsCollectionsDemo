package DesignPrinciplesAndPatterns.Strategy.streaming;

public interface QualityAdjustmentStrategy {
    VideoQuality supportsType();

    Video adjust(Video video);
}