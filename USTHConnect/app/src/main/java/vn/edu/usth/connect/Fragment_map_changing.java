package vn.edu.usth.connect;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class Fragment_map_changing extends FragmentStateAdapter {
        public Fragment_map_changing(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
            super(fragmentManager, lifecycle);

        }@NonNull
        @Override
        public Fragment createFragment(int position) {
            switch (position) {
                case 0:
                return new DashboardFragment();
                case 1:
                return new NotificationFragment();
                case 2:
                return new ProfileFragment();
                default:
                return new DashboardFragment();
            }
        }

        @Override
        public int getItemCount() {
            return 3;
        }
}
