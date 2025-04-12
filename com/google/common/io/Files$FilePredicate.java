/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Predicate;
import com.google.common.io.Files$1;
import com.google.common.io.Files$FilePredicate$1;
import com.google.common.io.Files$FilePredicate$2;

abstract class Files$FilePredicate
extends Enum
implements Predicate {
    private static final /* synthetic */ Files$FilePredicate[] $VALUES;
    public static final /* enum */ Files$FilePredicate IS_DIRECTORY;
    public static final /* enum */ Files$FilePredicate IS_FILE;

    private static /* synthetic */ Files$FilePredicate[] $values() {
        Files$FilePredicate files$FilePredicate = IS_DIRECTORY;
        files$FilePredicate = IS_FILE;
        Files$FilePredicate[] files$FilePredicateArray = new Files$FilePredicate[]{files$FilePredicate, files$FilePredicate};
        return files$FilePredicateArray;
    }

    static {
        Files$FilePredicate files$FilePredicate = new Files$FilePredicate$1();
        IS_DIRECTORY = files$FilePredicate;
        files$FilePredicate = new Files$FilePredicate$2();
        IS_FILE = files$FilePredicate;
        $VALUES = Files$FilePredicate.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Files$FilePredicate() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ Files$FilePredicate(Files$1 files$1) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    public static Files$FilePredicate valueOf(String string2) {
        return Enum.valueOf(Files$FilePredicate.class, string2);
    }

    public static Files$FilePredicate[] values() {
        return (Files$FilePredicate[])$VALUES.clone();
    }
}

