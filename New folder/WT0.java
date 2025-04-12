/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.FocusFinder
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;

public final class WT0 {
    public static final /* synthetic */ int a;

    public static final aG2 a(View view) {
        int[] nArray = VT0.a;
        view.getLocationInWindow(nArray);
        int n3 = nArray[0];
        float f5 = n3;
        int n4 = 1;
        float f6 = nArray[n4];
        float f7 = n3;
        float f8 = view.getWidth();
        float f11 = nArray[n4];
        float f12 = view.getHeight();
        aG2 aG22 = new aG2(f5, f6, f7 += f8, f11 += f12);
        return aG22;
    }

    public static final boolean b(View view, Integer n3, Rect rect) {
        int n4;
        if (n3 == null) {
            n4 = view.requestFocus();
        } else {
            boolean bl2 = view instanceof ViewGroup;
            if (!bl2) {
                int n7 = n3;
                n4 = view.requestFocus(n7, rect);
            } else {
                View view2 = view;
                view2 = (ViewGroup)view;
                boolean bl3 = view2.isFocused();
                if (bl3) {
                    n4 = 1;
                } else {
                    bl3 = view2.isFocusable();
                    if (bl3 && !(bl3 = view.hasFocus())) {
                        int n8 = n3;
                        n4 = view.requestFocus(n8, rect);
                    } else {
                        bl3 = view instanceof AndroidComposeView;
                        if (bl3) {
                            int n10 = n3;
                            n4 = view.requestFocus(n10, rect);
                        } else if (rect != null) {
                            int n14;
                            FocusFinder focusFinder = FocusFinder.getInstance();
                            view2 = focusFinder.findNextFocusFromRect((ViewGroup)view2, rect, n14 = n3.intValue());
                            if (view2 != null) {
                                n4 = n3;
                                n4 = (int)(view2.requestFocus(n4, rect) ? 1 : 0);
                            } else {
                                int n15 = n3;
                                n4 = (int)(view.requestFocus(n15, rect) ? 1 : 0);
                            }
                        } else {
                            boolean bl4 = view.hasFocus();
                            if (bl4) {
                                rect = view.findFocus();
                            } else {
                                bl4 = false;
                                rect = null;
                            }
                            FocusFinder focusFinder = FocusFinder.getInstance();
                            int n16 = n3;
                            rect = focusFinder.findNextFocus((ViewGroup)view2, (View)rect, n16);
                            if (rect != null) {
                                n4 = n3;
                                n4 = (int)(rect.requestFocus(n4) ? 1 : 0);
                            } else {
                                int n17 = n3;
                                n4 = (int)(view.requestFocus(n17) ? 1 : 0);
                            }
                        }
                    }
                }
            }
        }
        return n4 != 0;
    }

    public static final Integer c(int n3) {
        Integer n4;
        int n7 = (int)(LT0.a(n3, 5) ? 1 : 0);
        if (n7 != 0) {
            n3 = 33;
            n4 = n3;
        } else {
            n7 = LT0.a(n3, 6);
            if (n7 != 0) {
                n3 = 130;
                n4 = n3;
            } else {
                n7 = LT0.a(n3, 3);
                if (n7 != 0) {
                    n3 = 17;
                    n4 = n3;
                } else {
                    n7 = LT0.a(n3, 4);
                    if (n7 != 0) {
                        n3 = 66;
                        n4 = n3;
                    } else {
                        n7 = 1;
                        boolean bl2 = LT0.a(n3, n7);
                        int n8 = 2;
                        if (bl2) {
                            n4 = n8;
                        } else if ((n3 = (int)(LT0.a(n3, n8) ? 1 : 0)) != 0) {
                            n4 = n7;
                        } else {
                            n3 = 0;
                            n4 = null;
                        }
                    }
                }
            }
        }
        return n4;
    }

    public static final LT0 d(int n3) {
        LT0 lT0;
        int n4 = 2;
        int n7 = 1;
        if (n3 != n7) {
            if (n3 != n4) {
                n4 = 17;
                if (n3 != n4) {
                    n4 = 33;
                    if (n3 != n4) {
                        n4 = 66;
                        if (n3 != n4) {
                            n4 = 130;
                            if (n3 != n4) {
                                n3 = 0;
                                lT0 = null;
                            } else {
                                n4 = 6;
                                lT0 = new LT0(n4);
                            }
                        } else {
                            n4 = 4;
                            lT0 = new LT0(n4);
                        }
                    } else {
                        n4 = 5;
                        lT0 = new LT0(n4);
                    }
                } else {
                    n4 = 3;
                    lT0 = new LT0(n4);
                }
            } else {
                lT0 = new LT0(n7);
            }
        } else {
            lT0 = new LT0(n4);
        }
        return lT0;
    }
}

