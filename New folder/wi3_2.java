/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.inputmethod.ExtractedText
 */
import android.view.inputmethod.ExtractedText;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/*
 * Renamed from Wi3
 */
public final class wi3_2 {
    public static final ExtractedText a(ql3_0 ql3_02) {
        int n3;
        int n4;
        int n7;
        ExtractedText extractedText = new ExtractedText();
        String string2 = ql3_02.a.a;
        extractedText.text = string2;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = n7 = string2.length();
        extractedText.partialStartOffset = -1;
        long l2 = ql3_02.b;
        extractedText.selectionStart = n4 = mm3.e(l2);
        extractedText.selectionEnd = n7 = mm3.d(l2);
        extractedText.flags = n3 = StringsKt.G(ql3_02.a.a, '\n') ^ 1;
        return extractedText;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final Object b(Task object, f80_0 object2) {
        boolean bl2 = ((Task)object).isComplete();
        if (bl2) {
            object2 = ((Task)object).getException();
            if (object2 != null) throw object2;
            boolean bl3 = ((Task)object).isCanceled();
            if (!bl3) {
                return ((Task)object).getResult();
            }
            StringBuilder stringBuilder = new StringBuilder("Task ");
            stringBuilder.append(object);
            stringBuilder.append(" was cancelled normally.");
            object = stringBuilder.toString();
            object2 = new CancellationException((String)object);
            throw object2;
        }
        Object object3 = zj1_2.b((f80_0)object2);
        int n3 = 1;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(n3, (f80_0)object3);
        cancellableContinuationImpl.r();
        object3 = dq0_2.a;
        vi3_2 vi3_22 = new vi3_2(cancellableContinuationImpl);
        ((Task)object).addOnCompleteListener((Executor)object3, (OnCompleteListener)vi3_22);
        object = cancellableContinuationImpl.q();
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        if (object != j90_02) return object;
        String string2 = "frame";
        Intrinsics.checkNotNullParameter(object2, string2);
        return object;
    }
}

