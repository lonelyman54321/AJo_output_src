/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.SystemClock
 */
package androidx.loader.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.loader.content.AsyncTaskLoader$LoadTask;
import androidx.loader.content.ModernAsyncTask;
import androidx.loader.content.ModernAsyncTask$c;
import androidx.loader.content.ModernAsyncTask$f;
import androidx.loader.content.ModernAsyncTask$g;
import androidx.loader.content.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class AsyncTaskLoader
extends a {
    static final boolean DEBUG = false;
    static final String TAG = "AsyncTaskLoader";
    volatile AsyncTaskLoader$LoadTask mCancellingTask;
    private final Executor mExecutor;
    Handler mHandler;
    long mLastLoadCompleteTime;
    volatile AsyncTaskLoader$LoadTask mTask;
    long mUpdateThrottle;

    public AsyncTaskLoader(Context context) {
        ThreadPoolExecutor threadPoolExecutor = ModernAsyncTask.f;
        this(context, threadPoolExecutor);
    }

    private AsyncTaskLoader(Context context, Executor executor) {
        super(context);
        this.mLastLoadCompleteTime = -10000L;
        this.mExecutor = executor;
    }

    public void cancelLoadInBackground() {
    }

    public void dispatchOnCancelled(AsyncTaskLoader$LoadTask asyncTaskLoader$LoadTask, Object object) {
        this.onCanceled(object);
        object = this.mCancellingTask;
        if (object == asyncTaskLoader$LoadTask) {
            long l2;
            this.rollbackContentChanged();
            this.mLastLoadCompleteTime = l2 = SystemClock.uptimeMillis();
            asyncTaskLoader$LoadTask = null;
            this.mCancellingTask = null;
            this.deliverCancellation();
            this.executePendingTask();
        }
    }

    public void dispatchOnLoadComplete(AsyncTaskLoader$LoadTask asyncTaskLoader$LoadTask, Object object) {
        AsyncTaskLoader$LoadTask asyncTaskLoader$LoadTask2 = this.mTask;
        if (asyncTaskLoader$LoadTask2 != asyncTaskLoader$LoadTask) {
            this.dispatchOnCancelled(asyncTaskLoader$LoadTask, object);
        } else {
            boolean bl2 = this.isAbandoned();
            if (bl2) {
                this.onCanceled(object);
            } else {
                long l2;
                this.commitContentChanged();
                this.mLastLoadCompleteTime = l2 = SystemClock.uptimeMillis();
                bl2 = false;
                asyncTaskLoader$LoadTask = null;
                this.mTask = null;
                this.deliverResult(object);
            }
        }
    }

    public void dump(String string2, FileDescriptor object, PrintWriter printWriter, String[] object2) {
        long l2;
        long l3;
        long l4;
        long l7;
        super.dump(string2, (FileDescriptor)object, printWriter, (String[])object2);
        object = this.mTask;
        object2 = " waiting=";
        if (object != null) {
            printWriter.print(string2);
            printWriter.print("mTask=");
            object = this.mTask;
            printWriter.print(object);
            printWriter.print((String)object2);
            object = this.mTask;
            l7 = (long)((AsyncTaskLoader$LoadTask)object).i;
            printWriter.println((boolean)l7);
        }
        if ((object = this.mCancellingTask) != null) {
            printWriter.print(string2);
            printWriter.print("mCancellingTask=");
            object = this.mCancellingTask;
            printWriter.print(object);
            printWriter.print((String)object2);
            object = this.mCancellingTask;
            l7 = (long)((AsyncTaskLoader$LoadTask)object).i;
            printWriter.println((boolean)l7);
        }
        if ((l7 = (l4 = (l3 = this.mUpdateThrottle) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
            printWriter.print(string2);
            printWriter.print("mUpdateThrottle=");
            XR1.c(this.mUpdateThrottle, printWriter);
            string2 = " mLastLoadCompleteTime=";
            printWriter.print(string2);
            long l8 = this.mLastLoadCompleteTime;
            l3 = SystemClock.uptimeMillis();
            long l12 = l8 == l2 ? 0 : (l8 < l2 ? -1 : 1);
            if (l12 == false) {
                string2 = "--";
                printWriter.print(string2);
            } else {
                XR1.c(l8 -= l3, printWriter);
            }
            printWriter.println();
        }
    }

    public void executePendingTask() {
        Object object = this.mCancellingTask;
        if (object == null && (object = this.mTask) != null) {
            Object object2;
            Object object3;
            object = this.mTask;
            Object object4 = ((AsyncTaskLoader$LoadTask)object).i;
            if (object4 != 0) {
                object = this.mTask;
                object3 = 0;
                ((AsyncTaskLoader$LoadTask)object).i = false;
                object = this.mHandler;
                object2 = this.mTask;
                object.removeCallbacks((Runnable)object2);
            }
            long l2 = this.mUpdateThrottle;
            long l3 = 0L;
            Object object5 = 1;
            Object object6 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (object6 > 0) {
                l2 = SystemClock.uptimeMillis();
                l3 = this.mLastLoadCompleteTime;
                long l4 = this.mUpdateThrottle;
                long l7 = l2 - (l3 += l4);
                object6 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (object6 < 0) {
                    this.mTask.i = object5;
                    object = this.mHandler;
                    object2 = this.mTask;
                    l3 = this.mLastLoadCompleteTime;
                    long l8 = this.mUpdateThrottle;
                    object.postAtTime((Runnable)object2, l3 += l8);
                    return;
                }
            }
            object = this.mTask;
            object2 = this.mExecutor;
            Object object7 = ((ModernAsyncTask)object).c;
            ModernAsyncTask$f modernAsyncTask$f = ModernAsyncTask$f.PENDING;
            if (object7 != modernAsyncTask$f) {
                object2 = ModernAsyncTask$c.a;
                object = ((ModernAsyncTask)object).c;
                object4 = ((Enum)object).ordinal();
                if ((object4 = (Object)object2[object4]) != object5) {
                    object3 = 2;
                    if (object4 != object3) {
                        object = new IllegalStateException("We should never reach this state");
                        throw object;
                    }
                    object = new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                    throw object;
                }
                object = new IllegalStateException("Cannot execute task: the task is already running.");
                throw object;
            }
            ((ModernAsyncTask)object).c = object7 = ModernAsyncTask$f.RUNNING;
            object7 = ((ModernAsyncTask)object).a;
            modernAsyncTask$f = null;
            ((ModernAsyncTask$g)object7).a = null;
            object = ((ModernAsyncTask)object).b;
            object2.execute((Runnable)object);
        }
    }

    public boolean isLoadInBackgroundCanceled() {
        boolean bl2;
        AsyncTaskLoader$LoadTask asyncTaskLoader$LoadTask = this.mCancellingTask;
        if (asyncTaskLoader$LoadTask != null) {
            bl2 = true;
        } else {
            bl2 = false;
            asyncTaskLoader$LoadTask = null;
        }
        return bl2;
    }

    public abstract Object loadInBackground();

    public boolean onCancelLoad() {
        Runnable runnable2 = this.mTask;
        AsyncTaskLoader$LoadTask asyncTaskLoader$LoadTask = null;
        if (runnable2 != null) {
            boolean bl2 = this.mStarted;
            boolean bl3 = true;
            if (!bl2) {
                this.mContentChanged = bl3;
            }
            if ((runnable2 = this.mCancellingTask) != null) {
                runnable2 = this.mTask;
                bl2 = ((AsyncTaskLoader$LoadTask)runnable2).i;
                if (bl2) {
                    this.mTask.i = false;
                    runnable2 = this.mHandler;
                    AsyncTaskLoader$LoadTask asyncTaskLoader$LoadTask2 = this.mTask;
                    runnable2.removeCallbacks(asyncTaskLoader$LoadTask2);
                }
                this.mTask = null;
                return false;
            }
            runnable2 = this.mTask;
            bl2 = ((AsyncTaskLoader$LoadTask)runnable2).i;
            if (bl2) {
                this.mTask.i = false;
                runnable2 = this.mHandler;
                AsyncTaskLoader$LoadTask asyncTaskLoader$LoadTask3 = this.mTask;
                runnable2.removeCallbacks(asyncTaskLoader$LoadTask3);
                this.mTask = null;
                return false;
            }
            runnable2 = this.mTask;
            AtomicBoolean atomicBoolean = ((ModernAsyncTask)((Object)runnable2)).d;
            atomicBoolean.set(bl3);
            runnable2 = ((ModernAsyncTask)((Object)runnable2)).b;
            bl2 = ((FutureTask)runnable2).cancel(false);
            if (bl2) {
                this.mCancellingTask = asyncTaskLoader$LoadTask = this.mTask;
                this.cancelLoadInBackground();
            }
            this.mTask = null;
            return bl2;
        }
        return false;
    }

    public void onCanceled(Object object) {
    }

    public void onForceLoad() {
        AsyncTaskLoader$LoadTask asyncTaskLoader$LoadTask;
        super.onForceLoad();
        this.cancelLoad();
        this.mTask = asyncTaskLoader$LoadTask = new AsyncTaskLoader$LoadTask(this);
        this.executePendingTask();
    }

    public Object onLoadInBackground() {
        return this.loadInBackground();
    }

    public void setUpdateThrottle(long l2) {
        this.mUpdateThrottle = l2;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            Handler handler;
            this.mHandler = handler = new Handler();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void waitForLoader() {
        Object object = this.mTask;
        if (object == null) return;
        try {
            object = ((AsyncTaskLoader$LoadTask)object).h;
            ((CountDownLatch)object).await();
            return;
        }
        catch (InterruptedException interruptedException) {
            return;
        }
    }
}

