//Inside a a preference fragment
Preference myPref = findPreference(getString(R.string.example_key));
myPref.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
    public boolean onPreferenceClick(Preference preference) {
        someFunction(getActivity());
        return true;
    }
});
