/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.compose.ui.R$string;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class Me3 {
    public static final String a(b30_0 object, int n3) {
        kb2_0 kb2_02 = AndroidCompositionLocals_androidKt.a;
        object.j(kb2_02);
        kb2_02 = AndroidCompositionLocals_androidKt.b;
        object = ((Context)object.j(kb2_02)).getResources();
        kb2_02 = null;
        int n4 = Ae3.b(n3, 0);
        if (n4 != 0) {
            n3 = R$string.navigation_menu;
            object = object.getString(n3);
        } else {
            n4 = Ae3.b(n3, 1);
            if (n4 != 0) {
                n3 = R$string.close_drawer;
                object = object.getString(n3);
            } else {
                n4 = Ae3.b(n3, 2);
                if (n4 != 0) {
                    n3 = R$string.close_sheet;
                    object = object.getString(n3);
                } else {
                    n4 = Ae3.b(n3, 3);
                    if (n4 != 0) {
                        n3 = R$string.default_error_message;
                        object = object.getString(n3);
                    } else {
                        n4 = Ae3.b(n3, 4);
                        if (n4 != 0) {
                            n3 = R$string.dropdown_menu;
                            object = object.getString(n3);
                        } else {
                            n4 = Ae3.b(n3, 5);
                            if (n4 != 0) {
                                n3 = R$string.range_start;
                                object = object.getString(n3);
                            } else {
                                n4 = 6;
                                if ((n3 = (int)(Ae3.b(n3, n4) ? 1 : 0)) != 0) {
                                    n3 = R$string.range_end;
                                    object = object.getString(n3);
                                } else {
                                    object = "";
                                }
                            }
                        }
                    }
                }
            }
        }
        return object;
    }

    public static final int b(int n3) {
        int n4 = 0x12492492 & n3;
        int n7 = 0x24924924 & n3;
        n3 &= 0xC9249249;
        int n8 = n7 >> 1 | n4;
        n4 = n4 << 1 & n7;
        return (n3 |= n8) | n4;
    }
}

