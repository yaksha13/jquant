/*
 * Copyright (c) 2010, Sergey Edunov. All Rights Reserved.
 *
 * This file is part of JQuant library.
 *
 * JQuant library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3
 * of the License, or (at your option) any later version.
 *
 * JQuant is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with JQuant. If not, see <http://www.gnu.org/licenses/>.
 */
package ru.algorithmist.jquant.infr;

import ru.algorithmist.jquant.infr.impl.StandaloneHTTPClient;

/**
 * @author "Sergey Edunov"
 * @version 12/29/10
 */
public class HTTPClientFactory {

    private IHTTPClient instance = new StandaloneHTTPClient();

    private static HTTPClientFactory factory = new HTTPClientFactory();

    public static HTTPClientFactory getInstance(){
        return factory;
    }

    public IHTTPClient client(){
        return instance;
    }

    public void register(IHTTPClient client){
        instance = client;
    }
}
