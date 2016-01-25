/*
 * This file is part of HistacomAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2015-2016, Histacom Development Team <https://github.com/histacom>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package uk.jamierocks.histacom.api;

import uk.jamierocks.histacom.api.era.EraManager;
import uk.jamierocks.histacom.api.plugin.PluginManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.lexteam.eventbus.IEventBus;
import xyz.lexteam.eventbus.SimpleEventBus;

public abstract class Game {

    private final Logger logger = LoggerFactory.getLogger("Histacom");
    private final IEventBus eventBus = new SimpleEventBus();

    /**
     * The game's main logger.
     *
     * @return The main {@link Logger}.
     */
    public Logger getLogger() {
        return this.logger;
    }

    public IEventBus getEventBus() {
        return this.eventBus;
    }

    /**
     * The game's {@link EraManager}.
     *
     * @return The game's {@link EraManager}.
     */
    public abstract EraManager getEraManager();

    /**
     * The game's {@link PluginManager}.
     *
     * @return the game's {@link PluginManager}.
     */
    public abstract PluginManager getPluginManager();
}