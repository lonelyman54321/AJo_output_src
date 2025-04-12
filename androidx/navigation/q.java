/*
 * Decompiled with CFR 0.152.
 */
package androidx.navigation;

import androidx.navigation.p;
import androidx.navigation.q$a;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

public final class q {
    public static final LinkedHashMap b;
    public final LinkedHashMap a;

    static {
        LinkedHashMap linkedHashMap;
        b = linkedHashMap = new LinkedHashMap();
    }

    public q() {
        LinkedHashMap linkedHashMap;
        this.a = linkedHashMap = new LinkedHashMap();
    }

    public final void a(p object) {
        Object object2;
        block4: {
            String string2;
            Object object3;
            block6: {
                block7: {
                    block5: {
                        boolean bl2;
                        int n3;
                        object2 = "navigator";
                        Intrinsics.checkNotNullParameter(object, (String)object2);
                        String string3 = q$a.a(object.getClass());
                        object3 = "name";
                        Intrinsics.checkNotNullParameter(string3, (String)object3);
                        Intrinsics.checkNotNullParameter(object, (String)object2);
                        if (string3 == null || (n3 = string3.length()) <= 0) break block4;
                        object2 = this.a;
                        object3 = (p)((LinkedHashMap)object2).get(string3);
                        boolean bl3 = Intrinsics.areEqual(object3, object);
                        if (bl3) break block5;
                        bl3 = false;
                        boolean bl4 = true;
                        if (object3 != null && (bl2 = ((p)object3).b) == bl4) {
                            bl3 = true;
                        }
                        string2 = "Navigator ";
                        if (!(bl3 ^= bl4)) break block6;
                        boolean bl5 = ((p)object).b ^ bl4;
                        if (!bl5) break block7;
                        object = (p)object2.put(string3, object);
                    }
                    return;
                }
                object2 = new StringBuilder(string2);
                ((StringBuilder)object2).append(object);
                ((StringBuilder)object2).append(" is already attached to another NavController");
                object = ((StringBuilder)object2).toString();
                object = object.toString();
                object2 = new IllegalStateException((String)object);
                throw object2;
            }
            object2 = new StringBuilder(string2);
            ((StringBuilder)object2).append(object);
            ((StringBuilder)object2).append(" is replacing an already attached ");
            ((StringBuilder)object2).append(object3);
            object = ((StringBuilder)object2).toString();
            object = object.toString();
            object2 = new IllegalStateException((String)object);
            throw object2;
        }
        object2 = "navigator name cannot be an empty string".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final p b(String object) {
        int n3;
        Object object2 = "name";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        if (object != null && (n3 = ((String)object).length()) > 0) {
            object2 = (p)this.a.get(object);
            if (object2 != null) {
                return object2;
            }
            object = cP.a("Could not find Navigator with name \"", (String)object, "\". You must call NavController.addNavigator() for each navigation type.");
            object2 = new IllegalStateException((String)object);
            throw object2;
        }
        object2 = "navigator name cannot be an empty string".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }
}

