package dev.nipafx.lab.loom.disk;

import java.nio.file.Path;

import static java.util.Objects.requireNonNull;

public record FileStats(Path path, long size) implements Stats {

	public FileStats {
		requireNonNull(path);
	}

}