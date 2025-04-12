/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 */
import android.database.Cursor;
import java.util.concurrent.Callable;

public final class UF2
implements Callable {
    public final /* synthetic */ HP2 a;
    public final /* synthetic */ SF2 b;

    public UF2(SF2 sF2, HP2 hP2) {
        this.b = sF2;
        this.a = hP2;
    }

    public final Object call() {
        Throwable throwable2;
        FP2 fP2;
        block42: {
            Object object;
            block30: {
                Object object2;
                String string2;
                String string3;
                Object object3;
                String string4;
                Object object4;
                block41: {
                    boolean bl2;
                    int n3;
                    block40: {
                        int n4;
                        block39: {
                            block38: {
                                int n7;
                                block37: {
                                    block36: {
                                        long l2;
                                        int n8;
                                        block35: {
                                            block34: {
                                                int n10;
                                                block33: {
                                                    block32: {
                                                        int n14;
                                                        block31: {
                                                            fP2 = this.b.a;
                                                            object4 = this.a;
                                                            n10 = 0;
                                                            string4 = null;
                                                            fP2 = Oh0.b(fP2, (ag3_0)object4, false);
                                                            object4 = "id";
                                                            try {
                                                                n14 = yf0.b((Cursor)fP2, (String)object4);
                                                                string4 = "tag";
                                                            }
                                                            catch (Throwable throwable2) {}
                                                            n10 = yf0.b((Cursor)fP2, string4);
                                                            object3 = "date";
                                                            n8 = yf0.b((Cursor)fP2, (String)object3);
                                                            string3 = "clazz";
                                                            n7 = yf0.b((Cursor)fP2, string3);
                                                            string2 = "message";
                                                            n4 = yf0.b((Cursor)fP2, string2);
                                                            object2 = "content";
                                                            n3 = yf0.b((Cursor)fP2, (String)object2);
                                                            bl2 = fP2.moveToFirst();
                                                            object = null;
                                                            if (!bl2) break block30;
                                                            bl2 = fP2.isNull(n14);
                                                            if (!bl2) break block31;
                                                            n14 = 0;
                                                            object4 = null;
                                                            break block32;
                                                        }
                                                        l2 = fP2.getLong(n14);
                                                        object4 = l2;
                                                    }
                                                    bl2 = fP2.isNull(n10);
                                                    if (!bl2) break block33;
                                                    n10 = 0;
                                                    string4 = null;
                                                    break block34;
                                                }
                                                string4 = fP2.getString(n10);
                                            }
                                            bl2 = fP2.isNull(n8);
                                            if (!bl2) break block35;
                                            n8 = 0;
                                            object3 = null;
                                            break block36;
                                        }
                                        l2 = fP2.getLong(n8);
                                        object3 = l2;
                                    }
                                    bl2 = fP2.isNull(n7);
                                    if (!bl2) break block37;
                                    n7 = 0;
                                    string3 = null;
                                    break block38;
                                }
                                string3 = fP2.getString(n7);
                            }
                            bl2 = fP2.isNull(n4);
                            if (!bl2) break block39;
                            n4 = 0;
                            string2 = null;
                            break block40;
                        }
                        string2 = fP2.getString(n4);
                    }
                    bl2 = fP2.isNull(n3);
                    if (bl2) break block41;
                    object = fP2.getString(n3);
                }
                object2 = new Object();
                ((NF2)object2).a = object4;
                ((NF2)object2).b = string4;
                ((NF2)object2).c = object3;
                ((NF2)object2).d = string3;
                ((NF2)object2).e = string2;
                ((NF2)object2).f = object;
                object = object2;
                break block42;
            }
            fP2.close();
            return object;
        }
        fP2.close();
        throw throwable2;
    }

    public final void finalize() {
        this.a.release();
    }
}

