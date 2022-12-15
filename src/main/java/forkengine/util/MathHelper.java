/*
 * MIT License
 *
 * Copyright (c) 2022 XenFork Union
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package forkengine.util;

import org.joml.Math;

/**
 * The math utilities.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class MathHelper {
    /**
     * Converts the float color to byte.
     *
     * @param c the color value.
     * @return the converted value.
     */
    public static byte colorFloatToByte(float c) {
        return (byte) (Math.min(c * 256.0f, 255.0f));
    }

    /**
     * Converts the float vertex normal to byte.
     *
     * @param n the vertex normal value.
     * @return the converted value.
     */
    public static byte normalFloatToByte(float n) {
        return (byte) ((255.0f * n - 1.0f) * 0.5f);
    }
}