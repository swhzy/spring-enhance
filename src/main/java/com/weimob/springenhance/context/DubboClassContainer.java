package com.weimob.springenhance.context;

import com.weimob.springenhance.configuration.AutoProperties;
import com.weimob.springenhance.scanner.IDefinitionScanner;

public class DubboClassContainer {
    private final AutoProperties autoProperties;
    private final IDefinitionScanner scanner;

    public DubboClassContainer(AutoProperties autoProperties, IDefinitionScanner scanner) {
        this.autoProperties = autoProperties;
        this.scanner = scanner;
    }


}
