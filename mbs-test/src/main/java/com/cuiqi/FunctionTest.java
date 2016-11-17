package com.cuiqi;

import org.apache.ibatis.io.VFS;

import java.io.IOException;
import java.util.List;

/**
 * Created by 01439613 on 2016/11/9.
 */
public class FunctionTest {

    public static void main(String[] args) throws IOException {
        List<String> children = VFS.getInstance().list("mapper");
        assert children != null;
    }
}
