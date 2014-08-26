## Installing Clojure on Ubuntu (14.04)
I did this:

    sudo apt-get install leiningen

But that turned out to give me version 1.7 whereas I needed version 2. So I
ended up following the instructions on the Github page.

    wget -O ~/bin/lein https://raw.github.com/technomancy/leiningen/stable/bin/lein
    chmod 755 ~/bin/lein

because I already had `~/bin` in my `$PATH` anyway (it's quite handy for a
developer/power-user).


## How Gilli Installed Clojure on Ubuntu (14.04)
I downloaded the leiningen script from it's site (http://leiningen.org/

Made it executable:

    chmod +x lein
    
Moved it to some bin (I think I used `/bin` although I probably shouldn't have)

Installed the JDK:

    sudo apt-get install openjdk-7-jdk
    
Upgraded lein:

    lein upgrade

That's about it. `lein deps` should probably be run in the project's root
