/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.i$a;
import androidx.lifecycle.i$a$a$a;
import androidx.lifecycle.i$b;
import kotlin.jvm.internal.Intrinsics;

public final class i$a$a {
    public static i$a a(i$b enum_) {
        Intrinsics.checkNotNullParameter(enum_, "state");
        int[] nArray = i$a$a$a.$EnumSwitchMapping$0;
        int n3 = enum_.ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    n3 = 0;
                    enum_ = null;
                } else {
                    enum_ = i$a.ON_PAUSE;
                }
            } else {
                enum_ = i$a.ON_STOP;
            }
        } else {
            enum_ = i$a.ON_DESTROY;
        }
        return enum_;
    }

    public static i$a b(i$b enum_) {
        Intrinsics.checkNotNullParameter(enum_, "state");
        int[] nArray = i$a$a$a.$EnumSwitchMapping$0;
        int n3 = enum_.ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 5;
                if (n3 != n4) {
                    n3 = 0;
                    enum_ = null;
                } else {
                    enum_ = i$a.ON_CREATE;
                }
            } else {
                enum_ = i$a.ON_RESUME;
            }
        } else {
            enum_ = i$a.ON_START;
        }
        return enum_;
    }

    public static i$a c(i$b enum_) {
        Intrinsics.checkNotNullParameter(enum_, "state");
        int[] nArray = i$a$a$a.$EnumSwitchMapping$0;
        int n3 = enum_.ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    n3 = 0;
                    enum_ = null;
                } else {
                    enum_ = i$a.ON_RESUME;
                }
            } else {
                enum_ = i$a.ON_START;
            }
        } else {
            enum_ = i$a.ON_CREATE;
        }
        return enum_;
    }
}

