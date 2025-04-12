/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  android.view.View
 *  android.view.ViewGroup
 */
package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.n$c$b$a;
import androidx.fragment.app.n$c$b$b;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

public final class n$c$b
extends Enum {
    private static final /* synthetic */ n$c$b[] $VALUES;
    public static final n$c$b$a Companion;
    public static final /* enum */ n$c$b GONE;
    public static final /* enum */ n$c$b INVISIBLE;
    public static final /* enum */ n$c$b REMOVED;
    public static final /* enum */ n$c$b VISIBLE;

    private static final /* synthetic */ n$c$b[] $values() {
        n$c$b n$c$b = REMOVED;
        n$c$b = VISIBLE;
        n$c$b = GONE;
        n$c$b = INVISIBLE;
        n$c$b[] n$c$bArray = new n$c$b[]{n$c$b, n$c$b, n$c$b, n$c$b};
        return n$c$bArray;
    }

    static {
        Object object;
        REMOVED = object = new n$c$b("REMOVED", 0);
        VISIBLE = object = new n$c$b("VISIBLE", 1);
        GONE = object = new n$c$b("GONE", 2);
        INVISIBLE = object = new n$c$b("INVISIBLE", 3);
        $VALUES = n$c$b.$values();
        object = new Object();
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private n$c$b() {
        void var2_-1;
        void var1_-1;
    }

    public static final n$c$b from(int n3) {
        Companion.getClass();
        return n$c$b$a.b(n3);
    }

    public static n$c$b valueOf(String string2) {
        return Enum.valueOf(n$c$b.class, string2);
    }

    public static n$c$b[] values() {
        return (n$c$b[])$VALUES.clone();
    }

    public final void applyState(View view, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        Object object = n$c$b$b.$EnumSwitchMapping$0;
        int n3 = this.ordinal();
        int n4 = object[n3];
        n3 = 1;
        Object object2 = null;
        String string2 = "FragmentManager";
        int n7 = 2;
        if (n4 != n3) {
            if (n4 != n7) {
                int n8 = 3;
                if (n4 != n8) {
                    n8 = 4;
                    if (n4 == n8) {
                        n4 = (int)(Log.isLoggable((String)string2, (int)n7) ? 1 : 0);
                        if (n4 != 0) {
                            Objects.toString(view);
                        }
                        view.setVisibility(n8);
                    }
                } else {
                    n8 = (int)(Log.isLoggable((String)string2, (int)n7) ? 1 : 0);
                    if (n8 != 0) {
                        Objects.toString(view);
                    }
                    n8 = 8;
                    view.setVisibility(n8);
                }
            } else {
                n4 = (int)(Log.isLoggable((String)string2, (int)n7) ? 1 : 0);
                if (n4 != 0) {
                    Objects.toString(view);
                }
                if ((n3 = (object = (Object)view.getParent()) instanceof ViewGroup) != 0) {
                    object2 = object;
                    object2 = (ViewGroup)object;
                }
                if (object2 == null) {
                    n4 = (int)(Log.isLoggable((String)string2, (int)n7) ? 1 : 0);
                    if (n4 != 0) {
                        view.toString();
                        Objects.toString(viewGroup);
                    }
                    viewGroup.addView(view);
                }
                boolean bl2 = false;
                viewGroup = null;
                view.setVisibility(0);
            }
        } else {
            viewGroup = view.getParent();
            n4 = viewGroup instanceof ViewGroup;
            if (n4 != 0) {
                object2 = viewGroup;
                object2 = viewGroup;
            }
            if (object2 != null) {
                boolean bl3 = Log.isLoggable((String)string2, (int)n7);
                if (bl3) {
                    view.toString();
                    object2.toString();
                }
                object2.removeView(view);
            }
        }
    }
}

