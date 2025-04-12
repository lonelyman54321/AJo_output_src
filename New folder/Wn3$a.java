/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Wn3$a {
    public static wn3_0 a(String object) {
        Object object2;
        block14: {
            block15: {
                int n3;
                block12: {
                    block13: {
                        object2 = "javaName";
                        Intrinsics.checkNotNullParameter(object, (String)object2);
                        n3 = object.hashCode();
                        int n4 = 79201641;
                        if (n3 == n4) break block12;
                        n4 = 79923350;
                        if (n3 == n4) break block13;
                        switch (n3) {
                            default: {
                                break block14;
                            }
                            case -503070501: {
                                object2 = "TLSv1.3";
                                n3 = (int)(object.equals(object2) ? 1 : 0);
                                if (n3 != 0) {
                                    object = wn3_0.TLS_1_3;
                                    break;
                                }
                                break block14;
                            }
                            case -503070502: {
                                object2 = "TLSv1.2";
                                n3 = (int)(object.equals(object2) ? 1 : 0);
                                if (n3 != 0) {
                                    object = wn3_0.TLS_1_2;
                                    break;
                                }
                                break block14;
                            }
                            case -503070503: {
                                object2 = "TLSv1.1";
                                n3 = (int)(object.equals(object2) ? 1 : 0);
                                if (n3 != 0) {
                                    object = wn3_0.TLS_1_1;
                                    break;
                                }
                                break block14;
                            }
                        }
                        break block15;
                    }
                    object2 = "TLSv1";
                    n3 = (int)(object.equals(object2) ? 1 : 0);
                    if (n3 == 0) break block14;
                    object = wn3_0.TLS_1_0;
                    break block15;
                }
                object2 = "SSLv3";
                n3 = (int)(object.equals(object2) ? 1 : 0);
                if (n3 == 0) break block14;
                object = wn3_0.SSL_3_0;
            }
            return object;
        }
        object = "Unexpected TLS version: ".concat((String)object);
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }
}

