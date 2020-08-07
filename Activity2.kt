   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val intListener = object : InterstitialListener {
            override fun onInterstitialAdLoadFailed(p0: IronSourceError?) {
                    // Loading the content (player)
            }

            override fun onInterstitialAdClosed() {
            }

            override fun onInterstitialAdShowFailed(p0: IronSourceError?) {
            }

            override fun onInterstitialAdClicked() {
            }

            override fun onInterstitialAdReady() {
                  IronSource.showInterstitial("ABPlayerAd")
                  // Loading the content (player)
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
