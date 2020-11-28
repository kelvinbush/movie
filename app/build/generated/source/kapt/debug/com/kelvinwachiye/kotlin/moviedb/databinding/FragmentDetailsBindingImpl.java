package com.kelvinwachiye.kotlin.moviedb.databinding;
import com.kelvinwachiye.kotlin.moviedb.R;
import com.kelvinwachiye.kotlin.moviedb.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentDetailsBindingImpl extends FragmentDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.backdrop, 1);
        sViewsWithIds.put(R.id.cardView, 2);
        sViewsWithIds.put(R.id.rateImage, 3);
        sViewsWithIds.put(R.id.budgetImage, 4);
        sViewsWithIds.put(R.id.people, 5);
        sViewsWithIds.put(R.id.tvTitile, 6);
        sViewsWithIds.put(R.id.date, 7);
        sViewsWithIds.put(R.id.tvGenre, 8);
        sViewsWithIds.put(R.id.tvLanguage, 9);
        sViewsWithIds.put(R.id.btnadd, 10);
        sViewsWithIds.put(R.id.plot, 11);
        sViewsWithIds.put(R.id.tv_plot, 12);
        sViewsWithIds.put(R.id.textView8, 13);
        sViewsWithIds.put(R.id.castLayout, 14);
        sViewsWithIds.put(R.id.cast1, 15);
        sViewsWithIds.put(R.id.tv_cast_1, 16);
        sViewsWithIds.put(R.id.t_cast_1, 17);
        sViewsWithIds.put(R.id.cast2, 18);
        sViewsWithIds.put(R.id.tv_cast_2, 19);
        sViewsWithIds.put(R.id.t_cast_2, 20);
        sViewsWithIds.put(R.id.cast3, 21);
        sViewsWithIds.put(R.id.tv_cast_3, 22);
        sViewsWithIds.put(R.id.t_cast_3, 23);
        sViewsWithIds.put(R.id.cast4, 24);
        sViewsWithIds.put(R.id.tv_cast_4, 25);
        sViewsWithIds.put(R.id.t_cast_4, 26);
        sViewsWithIds.put(R.id.reviews, 27);
        sViewsWithIds.put(R.id.reviewLayout, 28);
        sViewsWithIds.put(R.id.authorImage, 29);
        sViewsWithIds.put(R.id.author, 30);
        sViewsWithIds.put(R.id.rvContent, 31);
        sViewsWithIds.put(R.id.textView9, 32);
        sViewsWithIds.put(R.id.textView10, 33);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 34, sIncludes, sViewsWithIds));
    }
    private FragmentDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[30]
            , (android.widget.ImageView) bindings[29]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[4]
            , (androidx.cardview.widget.CardView) bindings[2]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[15]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[18]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[21]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[24]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.TextView) bindings[7]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[11]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.LinearLayout) bindings[28]
            , (android.widget.TextView) bindings[27]
            , (android.widget.TextView) bindings[31]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[33]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[32]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[6]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.kelvinwachiye.kotlin.moviedb.ui.moviedetails.MovieDetailsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.kelvinwachiye.kotlin.moviedb.ui.moviedetails.MovieDetailsViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}