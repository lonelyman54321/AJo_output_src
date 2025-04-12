/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.InputDevice
 *  android.view.KeyEvent
 */
import android.view.InputDevice;
import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class ik3$a
extends Lambda
implements Function1 {
    public final /* synthetic */ YT0 c;
    public final /* synthetic */ Vt1 d;

    public ik3$a(YT0 yT0, Vt1 vt1) {
        this.c = yT0;
        this.d = vt1;
        super(1);
    }

    public final Object invoke(Object object) {
        int n3;
        int n4;
        object = ((Yn1)object).a;
        InputDevice inputDevice = object.getDevice();
        boolean bl2 = false;
        if (inputDevice != null && (n4 = inputDevice.supportsSource(513)) != 0 && (n3 = inputDevice.isVirtual()) == 0) {
            n3 = bo1_1.d((KeyEvent)object);
            n4 = 2;
            if ((n3 = (int)(ao1_2.a(n3, n4) ? 1 : 0)) != 0 && (n3 = object.getSource()) != (n4 = 257)) {
                n3 = (int)(ik3.a(19, (KeyEvent)object) ? 1 : 0);
                YT0 yT0 = this.c;
                if (n3 != 0) {
                    int n7 = 5;
                    bl2 = yT0.d(n7);
                } else {
                    n3 = (int)(ik3.a(20, (KeyEvent)object) ? 1 : 0);
                    if (n3 != 0) {
                        int n8 = 6;
                        bl2 = yT0.d(n8);
                    } else {
                        n3 = (int)(ik3.a(21, (KeyEvent)object) ? 1 : 0);
                        if (n3 != 0) {
                            int n10 = 3;
                            bl2 = yT0.d(n10);
                        } else {
                            n3 = (int)(ik3.a(22, (KeyEvent)object) ? 1 : 0);
                            if (n3 != 0) {
                                int n14 = 4;
                                bl2 = yT0.d(n14);
                            } else {
                                n3 = 23;
                                boolean bl3 = ik3.a(n3, (KeyEvent)object);
                                if (bl3) {
                                    object = this.d.c;
                                    if (object != null) {
                                        object.show();
                                    }
                                    bl2 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bl2;
    }
}

