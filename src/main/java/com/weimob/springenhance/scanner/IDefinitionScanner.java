package com.weimob.springenhance.scanner;

import java.util.Map;

public interface IDefinitionScanner {

    Map<String,Class> scanner(String basePackage);

}
