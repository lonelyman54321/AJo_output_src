/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.method.KeyListener
 *  android.text.method.NumberKeyListener
 *  android.util.AttributeSet
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 *  android.widget.EditText
 *  android.widget.TextView
 */
import android.content.Context;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.R$styleable;
import androidx.emoji2.text.EmojiCompat;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class rn {
    public final EditText a;
    public final My0 b;

    public rn(EditText editText) {
        My0 my0;
        this.a = editText;
        this.b = my0 = new My0(editText);
    }

    public final KeyListener a(KeyListener object) {
        boolean bl2 = object instanceof NumberKeyListener ^ true;
        if (bl2) {
            Object object2 = this.b.a;
            object2.getClass();
            bl2 = object instanceof sy0_0;
            if (!bl2) {
                if (object == null) {
                    object = null;
                } else {
                    bl2 = object instanceof NumberKeyListener;
                    if (!bl2) {
                        object2 = new sy0_0((KeyListener)object);
                        object = object2;
                    }
                }
            }
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(AttributeSet attributeSet, int n3) {
        Throwable throwable2;
        block3: {
            boolean bl2;
            block2: {
                Context context = this.a.getContext();
                int[] nArray = R$styleable.AppCompatTextView;
                attributeSet = context.obtainStyledAttributes(attributeSet, nArray, n3, 0);
                try {
                    n3 = R$styleable.AppCompatTextView_emojiCompatEnabled;
                    n3 = (int)(attributeSet.hasValue(n3) ? 1 : 0);
                    bl2 = true;
                    if (n3 == 0) break block2;
                    n3 = R$styleable.AppCompatTextView_emojiCompatEnabled;
                    bl2 = attributeSet.getBoolean(n3, bl2);
                }
                catch (Throwable throwable2) {
                    break block3;
                }
            }
            attributeSet.recycle();
            this.d(bl2);
            return;
        }
        attributeSet.recycle();
        throw throwable2;
    }

    public final Qy0 c(InputConnection object, EditorInfo editorInfo) {
        Object object2 = this.b;
        if (object == null) {
            object2.getClass();
            object = null;
        } else {
            object2 = ((My0)object2).a;
            object2.getClass();
            boolean bl2 = object instanceof Qy0;
            if (!bl2) {
                object2 = ((My0$a)object2).a;
                Qy0 qy0 = new Qy0((TextView)object2, (InputConnection)object, editorInfo);
                object = qy0;
            }
        }
        return (Qy0)((Object)object);
    }

    public final void d(boolean bl2) {
        wy0_0 wy0_02 = this.b.a.b;
        boolean bl3 = wy0_02.d;
        if (bl3 != bl2) {
            Object object = wy0_02.c;
            if (object != null) {
                object = EmojiCompat.a();
                Wy0$a wy0$a = wy0_02.c;
                object.getClass();
                B41.c(wy0$a, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = ((EmojiCompat)object).a;
                Lock lock = reentrantReadWriteLock.writeLock();
                lock.lock();
                try {
                    object = ((EmojiCompat)object).b;
                }
                catch (Throwable emojiCompat) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw emojiCompat;
                }
                ((Np)object).remove(wy0$a);
                object = reentrantReadWriteLock.writeLock();
                object.unlock();
            }
            wy0_02.d = bl2;
            if (bl2) {
                EmojiCompat emojiCompat = EmojiCompat.a();
                int n3 = emojiCompat.b();
                wy0_02 = wy0_02.a;
                wy0_0.a((EditText)wy0_02, n3);
            }
        }
    }
}

