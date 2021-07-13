package pl.ostrowskiartur.cucinando.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import dagger.android.support.DaggerFragment

abstract class BaseFragment : DaggerFragment() {

    private var activity: AppCompatActivity? = null

    @LayoutRes
    protected abstract fun layoutRes(): Int

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(layoutRes(), container, false)
    }

    override fun onDetach() {
        super.onDetach()
        activity = null
    }

    fun getBaseActivity(): AppCompatActivity? {
        return activity
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}