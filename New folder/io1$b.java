/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 */
import android.view.KeyEvent;

public final class io1$b
implements go1 {
    public final /* synthetic */ go1 a;

    public io1$b(ho1_1 ho1_12) {
        this.a = ho1_12;
    }

    public final Un1 a(KeyEvent keyEvent) {
        boolean bl2 = keyEvent.isShiftPressed();
        Un1 un1 = null;
        if (bl2 && (bl2 = keyEvent.isCtrlPressed())) {
            long l2;
            long l3 = to1_0.a(keyEvent.getKeyCode());
            bl2 = Rn1.a(l3, l2 = aH1.i);
            if (bl2) {
                un1 = Un1.SELECT_LEFT_WORD;
            } else {
                l2 = aH1.j;
                bl2 = Rn1.a(l3, l2);
                if (bl2) {
                    un1 = Un1.SELECT_RIGHT_WORD;
                } else {
                    l2 = aH1.k;
                    bl2 = Rn1.a(l3, l2);
                    if (bl2) {
                        un1 = Un1.SELECT_PREV_PARAGRAPH;
                    } else {
                        l2 = aH1.l;
                        bl2 = Rn1.a(l3, l2);
                        if (bl2) {
                            un1 = Un1.SELECT_NEXT_PARAGRAPH;
                        }
                    }
                }
            }
        } else {
            bl2 = keyEvent.isCtrlPressed();
            if (bl2) {
                long l4;
                long l7 = to1_0.a(keyEvent.getKeyCode());
                bl2 = Rn1.a(l7, l4 = aH1.i);
                if (bl2) {
                    un1 = Un1.LEFT_WORD;
                } else {
                    l4 = aH1.j;
                    bl2 = Rn1.a(l7, l4);
                    if (bl2) {
                        un1 = Un1.RIGHT_WORD;
                    } else {
                        l4 = aH1.k;
                        bl2 = Rn1.a(l7, l4);
                        if (bl2) {
                            un1 = Un1.PREV_PARAGRAPH;
                        } else {
                            l4 = aH1.l;
                            bl2 = Rn1.a(l7, l4);
                            if (bl2) {
                                un1 = Un1.NEXT_PARAGRAPH;
                            } else {
                                l4 = aH1.c;
                                bl2 = Rn1.a(l7, l4);
                                if (bl2) {
                                    un1 = Un1.DELETE_PREV_CHAR;
                                } else {
                                    l4 = aH1.t;
                                    bl2 = Rn1.a(l7, l4);
                                    if (bl2) {
                                        un1 = Un1.DELETE_NEXT_WORD;
                                    } else {
                                        l4 = aH1.s;
                                        bl2 = Rn1.a(l7, l4);
                                        if (bl2) {
                                            un1 = Un1.DELETE_PREV_WORD;
                                        } else {
                                            l4 = aH1.h;
                                            bl2 = Rn1.a(l7, l4);
                                            if (bl2) {
                                                un1 = Un1.DESELECT;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                bl2 = keyEvent.isShiftPressed();
                if (bl2) {
                    long l8;
                    long l12 = to1_0.a(keyEvent.getKeyCode());
                    bl2 = Rn1.a(l12, l8 = aH1.o);
                    if (bl2) {
                        un1 = Un1.SELECT_LINE_LEFT;
                    } else {
                        l8 = aH1.p;
                        bl2 = Rn1.a(l12, l8);
                        if (bl2) {
                            un1 = Un1.SELECT_LINE_RIGHT;
                        }
                    }
                } else {
                    bl2 = keyEvent.isAltPressed();
                    if (bl2) {
                        long l14;
                        long l15 = to1_0.a(keyEvent.getKeyCode());
                        bl2 = Rn1.a(l15, l14 = aH1.s);
                        if (bl2) {
                            un1 = Un1.DELETE_FROM_LINE_START;
                        } else {
                            l14 = aH1.t;
                            bl2 = Rn1.a(l15, l14);
                            if (bl2) {
                                un1 = Un1.DELETE_TO_LINE_END;
                            }
                        }
                    }
                }
            }
        }
        if (un1 == null) {
            go1 go12 = this.a;
            un1 = go12.a(keyEvent);
        }
        return un1;
    }
}

