/*
 * Copyright (C) 2023 Sebastian Krieter, Elias Kuiter
 *
 * This file is part of bin-ddnnife.
 *
 * bin-ddnnife is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3.0 of the License,
 * or (at your option) any later version.
 *
 * bin-ddnnife is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with bin-ddnnife. If not, see <https://www.gnu.org/licenses/>.
 *
 * See <https://github.com/FeatureIDE/FeatJAR-bin-ddnnife> for further information.
 */
package de.featjar.bin.ddnnife;

import de.featjar.util.bin.Binary;
import de.featjar.util.bin.OperatingSystem;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Set;

public class DdnnifeBinary extends Binary {
    public DdnnifeBinary() throws IOException {}

    @Override
    public Path getPath() {
        if (OperatingSystem.IS_WINDOWS) return BINARY_DIRECTORY.resolve("");
        else return BINARY_DIRECTORY.resolve("ddnnife");
    }

    @Override
    public Set<String> getResourceNames() {
        return OperatingSystem.IS_WINDOWS ? Set.of("") : Set.of("ddnnife");
    }
}
