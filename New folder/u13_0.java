/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 */
import android.content.Intent;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from U13
 */
public final class u13_0
implements dk$a_0 {
    public final /* synthetic */ int a;

    public /* synthetic */ u13_0(int n3) {
        this.a = n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean a(int n3, Intent intent) {
        Object object;
        Object object2;
        v13_0 v13_02;
        block28: {
            Class<os1_1> clazz;
            int n4;
            Object object3;
            block27: {
                block26: {
                    block22: {
                        block20: {
                            Throwable throwable32;
                            block23: {
                                block21: {
                                    Object object4;
                                    block19: {
                                        block18: {
                                            UUID uUID;
                                            block17: {
                                                n3 = this.a;
                                                v13_02 = new v13_0();
                                                object3 = os1_1.i(intent);
                                                object2 = null;
                                                if (object3 == null) return 0 != 0;
                                                object4 = pm_0.d;
                                                // MONITORENTER : object4
                                                object = "callId";
                                                Intrinsics.checkNotNullParameter(object3, (String)object);
                                                object = pm_0.class;
                                                boolean bl2 = td0.b(object);
                                                if (!bl2) {
                                                    try {
                                                        object = pm_0.e;
                                                        break block17;
                                                    }
                                                    catch (Throwable throwable2) {
                                                        td0.a(object, throwable2);
                                                    }
                                                }
                                                object = null;
                                            }
                                            if (object == null || (n4 = Intrinsics.areEqual(uUID = ((pm_0)object).a(), object3)) == 0 || (n4 = ((pm_0)object).b()) != n3) break block18;
                                            ((Pm$a)object4).a(null);
                                            // MONITOREXIT : object4
                                            break block19;
                                        }
                                        // MONITOREXIT : object4
                                        return 0 != 0;
                                    }
                                    n3 = 0;
                                    clazz = null;
                                    if (object == null) {
                                        return n3 != 0;
                                    }
                                    object3 = ((pm_0)object).a();
                                    object4 = ls1_1.a;
                                    object4 = "callId";
                                    Intrinsics.checkNotNullParameter(object3, (String)object4);
                                    clazz = ls1_1.f((UUID)object3, false);
                                    if (clazz != null) {
                                        qm0_1.d((File)((Object)clazz));
                                    }
                                    if (intent == null) break block26;
                                    clazz = os1_1.class;
                                    n4 = td0.b(clazz);
                                    if (n4 != 0) break block20;
                                    object3 = "resultIntent";
                                    try {
                                        Intrinsics.checkNotNullParameter(intent, (String)object3);
                                        n4 = (int)(os1_1.o(intent) ? 1 : 0);
                                        if (n4 == 0) break block20;
                                        object3 = os1_1.h(intent);
                                        if (object3 == null) break block21;
                                        object4 = "error";
                                        clazz = object3.getBundle((String)object4);
                                        break block22;
                                    }
                                    catch (Throwable throwable32) {
                                        break block23;
                                    }
                                }
                                clazz = intent.getExtras();
                                break block22;
                            }
                            td0.a(clazz, throwable32);
                        }
                        n3 = 0;
                        clazz = null;
                    }
                    clazz = os1_1.j(clazz);
                    break block27;
                }
                n3 = 0;
                clazz = null;
            }
            if (clazz != null) {
                boolean bl3 = clazz instanceof FacebookOperationCanceledException;
                if (bl3) {
                    v13_02.a((pm_0)object);
                    return 1 != 0;
                } else {
                    v13_02.b((pm_0)object, (FacebookException)((Object)clazz));
                }
                return 1 != 0;
            }
            if (intent != null && (n4 = (int)(td0.b(clazz = os1_1.class) ? 1 : 0)) == 0) {
                Throwable throwable422;
                block25: {
                    block24: {
                        object3 = "resultIntent";
                        try {
                            Intrinsics.checkNotNullParameter(intent, (String)object3);
                            n4 = os1_1.n(intent);
                            intent = intent.getExtras();
                            n4 = (int)(os1_1.p(n4) ? 1 : 0);
                            if (n4 == 0 || intent == null) break block24;
                            object3 = "com.facebook.platform.protocol.RESULT_ARGS";
                            clazz = intent.getBundle((String)object3);
                            object2 = clazz;
                        }
                        catch (Throwable throwable422) {
                            break block25;
                        }
                    }
                    object2 = intent;
                    break block28;
                }
                td0.a(clazz, throwable422);
            }
        }
        v13_02.c((pm_0)object, (Bundle)object2);
        return 1 != 0;
    }
}

