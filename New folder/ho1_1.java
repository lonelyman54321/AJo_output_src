/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 */
import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from ho1
 */
public final class ho1_1
implements go1 {
    public final /* synthetic */ Function1 a;

    public ho1_1(Function1 function1) {
        this.a = function1;
    }

    public final Un1 a(KeyEvent keyEvent) {
        Object object = new Yn1(keyEvent);
        Function1 function1 = this.a;
        object = (Boolean)function1.invoke(object);
        boolean bl2 = (Boolean)object;
        Un1 un1 = null;
        if (bl2 && (bl2 = keyEvent.isShiftPressed())) {
            long l2 = to1_0.a(keyEvent.getKeyCode());
            int n3 = aH1.y;
            long l3 = aH1.g;
            n3 = (int)(Rn1.a(l2, l3) ? 1 : 0);
            if (n3 != 0) {
                un1 = Un1.REDO;
            }
        } else {
            object = new Yn1(keyEvent);
            bl2 = (Boolean)(object = (Boolean)function1.invoke(object));
            if (bl2) {
                long l4 = bo1_1.c(keyEvent);
                int n4 = aH1.y;
                long l7 = aH1.b;
                n4 = (int)(Rn1.a(l4, l7) ? 1 : 0);
                if (n4 != 0) {
                    n4 = 1;
                } else {
                    l7 = aH1.q;
                    n4 = (int)(Rn1.a(l4, l7) ? 1 : 0);
                }
                if (n4 != 0) {
                    un1 = Un1.COPY;
                } else {
                    l7 = aH1.d;
                    n4 = (int)(Rn1.a(l4, l7) ? 1 : 0);
                    if (n4 != 0) {
                        un1 = Un1.PASTE;
                    } else {
                        l7 = aH1.f;
                        n4 = (int)(Rn1.a(l4, l7) ? 1 : 0);
                        if (n4 != 0) {
                            un1 = Un1.CUT;
                        } else {
                            l7 = aH1.a;
                            n4 = (int)(Rn1.a(l4, l7) ? 1 : 0);
                            if (n4 != 0) {
                                un1 = Un1.SELECT_ALL;
                            } else {
                                l7 = aH1.e;
                                n4 = (int)(Rn1.a(l4, l7) ? 1 : 0);
                                if (n4 != 0) {
                                    un1 = Un1.REDO;
                                } else {
                                    l7 = aH1.g;
                                    n4 = (int)(Rn1.a(l4, l7) ? 1 : 0);
                                    if (n4 != 0) {
                                        un1 = Un1.UNDO;
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                bl2 = keyEvent.isCtrlPressed();
                if (!bl2) {
                    bl2 = keyEvent.isShiftPressed();
                    if (bl2) {
                        long l8 = to1_0.a(keyEvent.getKeyCode());
                        int n7 = aH1.y;
                        long l12 = aH1.i;
                        n7 = (int)(Rn1.a(l8, l12) ? 1 : 0);
                        if (n7 != 0) {
                            un1 = Un1.SELECT_LEFT_CHAR;
                        } else {
                            l12 = aH1.j;
                            n7 = (int)(Rn1.a(l8, l12) ? 1 : 0);
                            if (n7 != 0) {
                                un1 = Un1.SELECT_RIGHT_CHAR;
                            } else {
                                l12 = aH1.k;
                                n7 = (int)(Rn1.a(l8, l12) ? 1 : 0);
                                if (n7 != 0) {
                                    un1 = Un1.SELECT_UP;
                                } else {
                                    l12 = aH1.l;
                                    n7 = (int)(Rn1.a(l8, l12) ? 1 : 0);
                                    if (n7 != 0) {
                                        un1 = Un1.SELECT_DOWN;
                                    } else {
                                        l12 = aH1.m;
                                        n7 = (int)(Rn1.a(l8, l12) ? 1 : 0);
                                        if (n7 != 0) {
                                            un1 = Un1.SELECT_PAGE_UP;
                                        } else {
                                            l12 = aH1.n;
                                            n7 = (int)(Rn1.a(l8, l12) ? 1 : 0);
                                            if (n7 != 0) {
                                                un1 = Un1.SELECT_PAGE_DOWN;
                                            } else {
                                                l12 = aH1.o;
                                                n7 = (int)(Rn1.a(l8, l12) ? 1 : 0);
                                                if (n7 != 0) {
                                                    un1 = Un1.SELECT_LINE_START;
                                                } else {
                                                    l12 = aH1.p;
                                                    n7 = (int)(Rn1.a(l8, l12) ? 1 : 0);
                                                    if (n7 != 0) {
                                                        un1 = Un1.SELECT_LINE_END;
                                                    } else {
                                                        l12 = aH1.q;
                                                        n7 = (int)(Rn1.a(l8, l12) ? 1 : 0);
                                                        if (n7 != 0) {
                                                            un1 = Un1.PASTE;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        long l14 = to1_0.a(keyEvent.getKeyCode());
                        int n8 = aH1.y;
                        long l15 = aH1.i;
                        n8 = (int)(Rn1.a(l14, l15) ? 1 : 0);
                        if (n8 != 0) {
                            un1 = Un1.LEFT_CHAR;
                        } else {
                            l15 = aH1.j;
                            n8 = (int)(Rn1.a(l14, l15) ? 1 : 0);
                            if (n8 != 0) {
                                un1 = Un1.RIGHT_CHAR;
                            } else {
                                l15 = aH1.k;
                                n8 = (int)(Rn1.a(l14, l15) ? 1 : 0);
                                if (n8 != 0) {
                                    un1 = Un1.UP;
                                } else {
                                    l15 = aH1.l;
                                    n8 = (int)(Rn1.a(l14, l15) ? 1 : 0);
                                    if (n8 != 0) {
                                        un1 = Un1.DOWN;
                                    } else {
                                        l15 = aH1.m;
                                        n8 = (int)(Rn1.a(l14, l15) ? 1 : 0);
                                        if (n8 != 0) {
                                            un1 = Un1.PAGE_UP;
                                        } else {
                                            l15 = aH1.n;
                                            n8 = (int)(Rn1.a(l14, l15) ? 1 : 0);
                                            if (n8 != 0) {
                                                un1 = Un1.PAGE_DOWN;
                                            } else {
                                                l15 = aH1.o;
                                                n8 = (int)(Rn1.a(l14, l15) ? 1 : 0);
                                                if (n8 != 0) {
                                                    un1 = Un1.LINE_START;
                                                } else {
                                                    l15 = aH1.p;
                                                    n8 = (int)(Rn1.a(l14, l15) ? 1 : 0);
                                                    if (n8 != 0) {
                                                        un1 = Un1.LINE_END;
                                                    } else {
                                                        l15 = aH1.r;
                                                        n8 = (int)(Rn1.a(l14, l15) ? 1 : 0);
                                                        if (n8 != 0) {
                                                            un1 = Un1.NEW_LINE;
                                                        } else {
                                                            l15 = aH1.s;
                                                            n8 = (int)(Rn1.a(l14, l15) ? 1 : 0);
                                                            if (n8 != 0) {
                                                                un1 = Un1.DELETE_PREV_CHAR;
                                                            } else {
                                                                l15 = aH1.t;
                                                                n8 = (int)(Rn1.a(l14, l15) ? 1 : 0);
                                                                if (n8 != 0) {
                                                                    un1 = Un1.DELETE_NEXT_CHAR;
                                                                } else {
                                                                    l15 = aH1.u;
                                                                    n8 = (int)(Rn1.a(l14, l15) ? 1 : 0);
                                                                    if (n8 != 0) {
                                                                        un1 = Un1.PASTE;
                                                                    } else {
                                                                        l15 = aH1.v;
                                                                        n8 = (int)(Rn1.a(l14, l15) ? 1 : 0);
                                                                        if (n8 != 0) {
                                                                            un1 = Un1.CUT;
                                                                        } else {
                                                                            l15 = aH1.w;
                                                                            n8 = (int)(Rn1.a(l14, l15) ? 1 : 0);
                                                                            if (n8 != 0) {
                                                                                un1 = Un1.COPY;
                                                                            } else {
                                                                                l15 = aH1.x;
                                                                                n8 = (int)(Rn1.a(l14, l15) ? 1 : 0);
                                                                                if (n8 != 0) {
                                                                                    un1 = Un1.TAB;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return un1;
    }
}

