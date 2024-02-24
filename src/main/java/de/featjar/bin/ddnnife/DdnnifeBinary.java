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

import de.featjar.base.data.Sets;
import de.featjar.base.env.ABinary;
import de.featjar.base.env.HostEnvironment;
import java.io.IOException;
import java.util.LinkedHashSet;

public class DdnnifeBinary extends ABinary {
    public DdnnifeBinary() throws IOException {}

    @Override
    public String getExecutableName() {
        return HostEnvironment.isWindows() ? "" : "ddnnife";
    }

    @Override
    public LinkedHashSet<String> getResourceNames() {
        return HostEnvironment.isWindows() ? Sets.of("") : Sets.of("ddnnife");
    }
}
