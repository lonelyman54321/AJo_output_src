/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnKeyListener
 *  android.os.Build$VERSION
 *  android.util.SparseArray
 *  android.view.KeyEvent
 *  android.view.KeyEvent$Callback
 *  android.view.KeyEvent$DispatcherState
 *  android.view.View
 *  android.view.Window$Callback
 */
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.core.R$id;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$l;
import java.lang.ref.WeakReference;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * Renamed from Zn1
 */
public final class zn1_0 {
    public static boolean a = false;
    public static Method b;
    public static boolean c = false;
    public static Field d;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean a(View var0, KeyEvent var1_1) {
        block7: {
            var2_2 = ViewCompat.a;
            var3_3 = Build.VERSION.SDK_INT;
            var4_4 = 28;
            var5_5 = false;
            if (var3_3 >= var4_4) break block7;
            var2_2 = ViewCompat$l.d;
            var3_3 = R$id.tag_unhandled_key_event_manager;
            var2_2 = (ViewCompat$l)var0 /* !! */ .getTag(var3_3);
            if (var2_2 == null) {
                var2_2 = new ViewCompat$l();
                var4_4 = R$id.tag_unhandled_key_event_manager;
                var0 /* !! */ .setTag(var4_4, var2_2);
            }
            if ((var0 /* !! */  = var2_2.c) != null && (var0 /* !! */  = var0 /* !! */ .get()) == var1_1) break block7;
            var0 /* !! */  = new WeakReference(var1_1);
            var2_2.c = var0 /* !! */ ;
            var0 /* !! */  = var2_2.b;
            if (var0 /* !! */  == null) {
                var0 /* !! */  = new SparseArray();
                var2_2.b = var0 /* !! */ ;
            }
            var0 /* !! */  = var2_2.b;
            var3_3 = var1_1.getAction();
            if (var3_3 != (var4_4 = 1)) ** GOTO lbl-1000
            var3_3 = var1_1.getKeyCode();
            if ((var3_3 = var0 /* !! */ .indexOfKey(var3_3)) >= 0) {
                var6_6 = (WeakReference)var0 /* !! */ .valueAt(var3_3);
                var0 /* !! */ .removeAt(var3_3);
            } else lbl-1000:
            // 2 sources

            {
                var6_6 = null;
            }
            if (var6_6 == null) {
                var3_3 = var1_1.getKeyCode();
                var0 /* !! */  = var0 /* !! */ .get(var3_3);
                var6_6 = var0 /* !! */ ;
                var6_6 = (WeakReference)var0 /* !! */ ;
            }
            if (var6_6 != null) {
                var0 /* !! */  = (View)var6_6.get();
                if (var0 /* !! */  != null && (var3_3 = (int)var0 /* !! */ .isAttachedToWindow()) != 0) {
                    ViewCompat$l.b(var0 /* !! */ , var1_1);
                }
                var5_5 = true;
            }
        }
        return var5_5;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean b(zn1$a_0 object, View object2, Window.Callback callback2, KeyEvent keyEvent) {
        int n3;
        boolean bl2;
        KeyEvent.DispatcherState dispatcherState;
        int n4;
        block23: {
            block28: {
                block21: {
                    boolean bl3;
                    block25: {
                        Object[] objectArray;
                        GenericDeclaration genericDeclaration;
                        boolean bl4;
                        block26: {
                            block20: {
                                boolean bl5;
                                block27: {
                                    int n7;
                                    block24: {
                                        int n8;
                                        n4 = 1;
                                        bl4 = false;
                                        if (object == null) {
                                            return false;
                                        }
                                        n7 = Build.VERSION.SDK_INT;
                                        int n10 = 28;
                                        if (n7 >= n10) {
                                            return object.superDispatchKeyEvent(keyEvent);
                                        }
                                        n7 = callback2 instanceof Activity;
                                        n10 = 0;
                                        dispatcherState = null;
                                        if (n7 == 0) break block24;
                                        callback2 = (Activity)callback2;
                                        callback2.onUserInteraction();
                                        object = callback2.getWindow();
                                        bl3 = object.hasFeature(8);
                                        if (!bl3) break block25;
                                        object2 = callback2.getActionBar();
                                        n7 = keyEvent.getKeyCode();
                                        if (n7 != (n8 = 82) || object2 == null) break block25;
                                        n7 = (int)(a ? 1 : 0);
                                        if (n7 != 0) break block26;
                                        try {
                                            Class<KeyEvent> clazz;
                                            genericDeclaration = object2.getClass();
                                            objectArray = "onMenuKeyEvent";
                                            Class[] classArray = new Class[n4];
                                            classArray[0] = clazz = KeyEvent.class;
                                            genericDeclaration = ((Class)genericDeclaration).getMethod((String)objectArray, classArray);
                                            b = genericDeclaration;
                                            break block20;
                                        }
                                        catch (NoSuchMethodException noSuchMethodException) {}
                                    }
                                    n7 = callback2 instanceof Dialog;
                                    if (n7 == 0) break block27;
                                    callback2 = (Dialog)callback2;
                                    bl2 = c;
                                    if (bl2) break block28;
                                    object = Dialog.class;
                                    object2 = "mOnKeyListener";
                                    try {
                                        d = object = ((Class)object).getDeclaredField((String)object2);
                                        ((AccessibleObject)object).setAccessible(n4 != 0);
                                        break block21;
                                    }
                                    catch (NoSuchFieldException noSuchFieldException) {}
                                }
                                if (object2 != null) {
                                    boolean bl6 = ViewCompat.c((View)object2, keyEvent);
                                    if (bl6) return n4 != 0;
                                }
                                if (!(bl5 = object.superDispatchKeyEvent(keyEvent))) return 0 != 0;
                                return n4 != 0;
                            }
                            a = n4;
                        }
                        if ((genericDeclaration = b) != null) {
                            try {
                                objectArray = new Object[n4];
                                objectArray[0] = keyEvent;
                                object2 = ((Method)genericDeclaration).invoke(object2, objectArray);
                                if (object2 != null) {
                                    object2 = (Boolean)object2;
                                    bl4 = (Boolean)object2;
                                }
                            }
                            catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {}
                        }
                        if (bl4) {
                            return n4 != 0;
                        }
                    }
                    if (bl3 = object.superDispatchKeyEvent(keyEvent)) {
                        return n4 != 0;
                    }
                    bl3 = ViewCompat.c((View)(object = object.getDecorView()), keyEvent);
                    if (bl3) {
                        return n4 != 0;
                    }
                    if (object == null) return keyEvent.dispatch((KeyEvent.Callback)callback2, dispatcherState, (Object)callback2) != 0;
                    dispatcherState = object.getKeyDispatcherState();
                    return keyEvent.dispatch((KeyEvent.Callback)callback2, dispatcherState, (Object)callback2) != 0;
                }
                c = n4;
            }
            if ((object = d) != null) {
                try {
                    object = ((Field)object).get(callback2);
                    object = (DialogInterface.OnKeyListener)object;
                    break block23;
                }
                catch (IllegalAccessException illegalAccessException) {}
            }
            bl2 = false;
            object = null;
        }
        if (object != null && (bl2 = object.onKey((DialogInterface)callback2, n3 = keyEvent.getKeyCode(), keyEvent))) {
            return n4 != 0;
        }
        object = callback2.getWindow();
        n3 = (int)(object.superDispatchKeyEvent(keyEvent) ? 1 : 0);
        if (n3 != 0) {
            return n4 != 0;
        }
        n3 = (int)(ViewCompat.c((View)(object = object.getDecorView()), keyEvent) ? 1 : 0);
        if (n3 != 0) {
            return n4 != 0;
        }
        if (object == null) return (int)(keyEvent.dispatch((KeyEvent.Callback)callback2, dispatcherState, (Object)callback2) ? 1 : 0) != 0;
        dispatcherState = object.getKeyDispatcherState();
        return (int)(keyEvent.dispatch((KeyEvent.Callback)callback2, dispatcherState, (Object)callback2) ? 1 : 0) != 0;
    }
}

