/*
 * Mantou Earth - Live your wallpaper with live earth
 * Copyright (C) 2015-2019 XiNGRZ <xxx@oxo.ooo>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package ooo.oxo.apps.earth;

import android.util.DisplayMetrics;

class Resolutions {

    static final int[] RESOLUTIONS = new int[]{
            480, 720, 1080, 1440, 2160
    };

    static final int[] RESOLUTION_DAILY_TRAFFICS_KB = new int[]{
            621, 1298, 2640, 4368, 8568
    };

    static int findBestResolutionIndex(int size) {
        int closest = 0;

        for (int i = 0; i < Resolutions.RESOLUTIONS.length; i++) {
            if (Math.abs(Resolutions.RESOLUTIONS[i] - size) <
                    Math.abs(Resolutions.RESOLUTIONS[closest] - size)) {
                closest = i;
            }
        }

        return closest;
    }

    private static int findBestResolution(int size) {
        return RESOLUTIONS[findBestResolutionIndex(size)];
    }

    static int findBestResolution(DisplayMetrics metrics) {
        return findBestResolution(Math.min(metrics.widthPixels, metrics.heightPixels));
    }

}
