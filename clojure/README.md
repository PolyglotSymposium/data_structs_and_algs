## Installing Clojure on Ubuntu (14.04)
I did this:

    sudo apt-get install leiningen

But that turned out to give me version 1.7 whereas I needed version 2. So I
ended up following the instructions on the Github page.

    wget -O ~/bin/lein https://raw.github.com/technomancy/leiningen/stable/bin/lein
    chmod 755 ~/bin/lein

because I already had `~/bin` in my `$PATH` anyway (it's quite handy for a
developer/power-user).
