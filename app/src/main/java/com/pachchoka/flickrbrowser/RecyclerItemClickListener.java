package com.pachchoka.flickrbrowser;

import android.content.Context;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by shahed on 2/3/17.
 */

class RecyclerItemClickListener extends RecyclerView.SimpleOnItemTouchListener {
    private static final String TAG = "RecyclerItemClickListener";

    interface OnRecyclerClickListener {
        void onItemClick(View view, int position);

        void onItemLongClick(View view, int position);
    }

    private final OnRecyclerClickListener onRecyclerClickListener;
    private final GestureDetectorCompat gestureDetector;

    RecyclerItemClickListener(Context context, final RecyclerView recyclerView, OnRecyclerClickListener onRecyclerClickListener) {
        this.onRecyclerClickListener = onRecyclerClickListener;
        gestureDetector = null;
    }

    @Override
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
        Log.d(TAG, "onInterceptTouchEvent: starts");
        return super.onInterceptTouchEvent(rv, e);
    }
}
