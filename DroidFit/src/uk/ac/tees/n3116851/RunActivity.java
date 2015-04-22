package uk.ac.tees.n3116851;

import android.support.v4.app.Fragment;

public class RunActivity extends SingleFragmentActivity {
    
    @Override
    protected Fragment createFragment() {
        return new RunFragment();
    }

}
