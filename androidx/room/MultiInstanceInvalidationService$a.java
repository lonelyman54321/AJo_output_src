/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IInterface
 *  android.os.RemoteException
 */
package androidx.room;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;
import androidx.room.MultiInstanceInvalidationService$b;
import androidx.room.b;
import androidx.room.b$a;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class MultiInstanceInvalidationService$a
extends b$a {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public MultiInstanceInvalidationService$a(MultiInstanceInvalidationService object) {
        this.a = object;
        object = b.m0;
        this.attachInterface(this, (String)object);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(int n3, String[] stringArray) {
        Intrinsics.checkNotNullParameter(stringArray, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.a;
        MultiInstanceInvalidationService$b multiInstanceInvalidationService$b = multiInstanceInvalidationService.c;
        synchronized (multiInstanceInvalidationService$b) {
            Throwable throwable3;
            Object object;
            Object object2;
            block10: {
                object2 = multiInstanceInvalidationService.b;
                object = n3;
                object2 = ((LinkedHashMap)object2).get(object);
                object2 = (String)object2;
                if (object2 != null) break block10;
                return;
            }
            object = multiInstanceInvalidationService.c;
            int n4 = object.beginBroadcast();
            for (int i3 = 0; i3 < n4; ++i3) {
                Throwable throwable2222;
                block11: {
                    try {
                        boolean bl2;
                        Object object3 = multiInstanceInvalidationService.c;
                        object3 = object3.getBroadcastCookie(i3);
                        String string2 = "null cannot be cast to non-null type kotlin.Int";
                        Intrinsics.checkNotNull(object3, string2);
                        object3 = (Integer)object3;
                        int n7 = (Integer)object3;
                        LinkedHashMap linkedHashMap = multiInstanceInvalidationService.b;
                        object3 = linkedHashMap.get(object3);
                        object3 = (String)object3;
                        if (n3 == n7 || !(bl2 = Intrinsics.areEqual(object2, object3))) continue;
                        object3 = multiInstanceInvalidationService.c;
                        object3 = object3.getBroadcastItem(i3);
                        object3 = (bc1_0)object3;
                        object3.b(stringArray);
                        continue;
                    }
                    catch (Throwable throwable2222) {
                        break block11;
                    }
                    catch (RemoteException remoteException) {}
                    continue;
                }
                try {
                    stringArray = multiInstanceInvalidationService.c;
                    stringArray.finishBroadcast();
                    throw throwable2222;
                }
                catch (Throwable throwable3) {
                }
            }
            Object object4 = multiInstanceInvalidationService.c;
            object4.finishBroadcast();
            object4 = Unit.a;
            return;
            throw throwable3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int d(bc1_0 object, String string2) {
        Intrinsics.checkNotNullParameter(object, "callback");
        int n3 = 0;
        LinkedHashMap linkedHashMap = null;
        if (string2 == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.a;
        MultiInstanceInvalidationService$b multiInstanceInvalidationService$b = multiInstanceInvalidationService.c;
        synchronized (multiInstanceInvalidationService$b) {
            Throwable throwable2;
            block5: {
                int n4;
                try {
                    int n7;
                    multiInstanceInvalidationService.a = n7 = multiInstanceInvalidationService.a + 1;
                    MultiInstanceInvalidationService$b multiInstanceInvalidationService$b2 = multiInstanceInvalidationService.c;
                    Integer n8 = n7;
                    n4 = multiInstanceInvalidationService$b2.register((IInterface)object, n8);
                    if (n4 != 0) {
                        object = n7;
                        linkedHashMap = multiInstanceInvalidationService.b;
                        linkedHashMap.put(object, string2);
                        return n7;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                multiInstanceInvalidationService.a = n4 = multiInstanceInvalidationService.a + -1;
                return n3;
            }
            throw throwable2;
        }
    }

    public final void e(bc1_0 object, int n3) {
        Intrinsics.checkNotNullParameter(object, "callback");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.a;
        MultiInstanceInvalidationService$b multiInstanceInvalidationService$b = multiInstanceInvalidationService.c;
        synchronized (multiInstanceInvalidationService$b) {
            MultiInstanceInvalidationService$b multiInstanceInvalidationService$b2 = multiInstanceInvalidationService.c;
            multiInstanceInvalidationService$b2.unregister((IInterface)object);
            object = multiInstanceInvalidationService.b;
            Integer n4 = n3;
            object = object.remove(n4);
            object = (String)object;
            return;
        }
    }
}

