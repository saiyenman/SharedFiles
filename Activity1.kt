   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val intListener = object : InterstitialListener {
            override fun onInterstitialAdLoadFailed(p0: IronSourceError?) {
                if (episodesLoaded) {
                    // Loading the content (episodes)
                }
            }

            override fun onInterstitialAdClosed() {
            }

            override fun onInterstitialAdShowFailed(p0: IronSourceError?) {
            }

            override fun onInterstitialAdClicked() {
            }

            override fun onInterstitialAdReady() {
                if (episodesLoaded) {
                    IronSource.showInterstitial("AnimeAd")
                    // Loading the content (episodes)
                }
            }

            override fun onInterstitialAdOpened() {
            }

            override fun onInterstitialAdShowSucceeded() {
            }
        }
        IronSource.setInterstitialListener(intListener)
        IronSource.loadInterstitial()
  }
  
     override fun onResume() {
        super.onResume()
        IronSource.onResume(this)
    }
    
    override fun onPause() {
        super.onPause()
        IronSource.onPause(this)
    }
