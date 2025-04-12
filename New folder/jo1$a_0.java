/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 */
import android.view.KeyEvent;

/*
 * Renamed from jo1$a
 */
public final class jo1$a_0
implements go1 {
    public final Un1 a(KeyEvent keyEvent) {
        boolean bl2 = keyEvent.isShiftPressed();
        Un1 un1 = null;
        if (bl2 && (bl2 = keyEvent.isAltPressed())) {
            long l2;
            long l3 = to1_0.a(keyEvent.getKeyCode());
            bl2 = Rn1.a(l3, l2 = aH1.i);
            if (bl2) {
                un1 = Un1.SELECT_LINE_LEFT;
            } else {
                l2 = aH1.j;
                bl2 = Rn1.a(l3, l2);
                if (bl2) {
                    un1 = Un1.SELECT_LINE_RIGHT;
                } else {
                    l2 = aH1.k;
                    bl2 = Rn1.a(l3, l2);
                    if (bl2) {
                        un1 = Un1.SELECT_HOME;
                    } else {
                        l2 = aH1.l;
                        bl2 = Rn1.a(l3, l2);
                        if (bl2) {
                            un1 = Un1.SELECT_END;
                        }
                    }
                }
            }
        } else {
            bl2 = keyEvent.isAltPressed();
            if (bl2) {
                long l4;
                long l7 = to1_0.a(keyEvent.getKeyCode());
                bl2 = Rn1.a(l7, l4 = aH1.i);
                if (bl2) {
                    un1 = Un1.LINE_LEFT;
                } else {
                    l4 = aH1.j;
                    bl2 = Rn1.a(l7, l4);
                    if (bl2) {
                        un1 = Un1.LINE_RIGHT;
                    } else {
                        l4 = aH1.k;
                        bl2 = Rn1.a(l7, l4);
                        if (bl2) {
                            un1 = Un1.HOME;
                        } else {
                            l4 = aH1.l;
                            bl2 = Rn1.a(l7, l4);
                            if (bl2) {
                                un1 = Un1.END;
                            }
                        }
                    }
                }
            }
        }
        if (un1 == null) {
            io1$b io1$b = io1.a;
            un1 = io1$b.a(keyEvent);
        }
        return un1;
    }
}

