package com.example.intellihome

object ObsceneWords {
    //Lista proporcionada por: https://github.com/NeoRaidenX/Youtube-blacklist_comments/blob/master/blacklist_es
    val words = listOf(
        "abanto", "abrazafarolas", "adufe", "afloja", "alcornoque", "alfeñíque",
        "anal", "andurriasmo", "argentuzo", "argentuso", "argentucho", "arrastracueros",
        "Arse", "Arsehole", "arseholes", "artabán", "artaban", "ass", "asshole",
        "assholes", "auschwitz", "ausschwitz", "aguebonado", "aguebonada",
        "agüevonado", "agüevonada", "asco", "asqueroso", "asquerosa", "aweonado",
        "aweonada", "awebonado", "awebonada", "awevonado", "awevonada", "baboso",
        "babosa", "babosadas", "basura", "Bellaco", "bitch", "bizcocho", "blow",
        "Blowjob", "Bollocks", "bolú", "bolu", "boludo", "b0ludo", "bolud0",
        "b0lud0", "boluda", "b0luda", "boobs", "bufarron", "bufarrón", "bujarron",
        "bujarrón", "buey", "Bullshit", "buttfuck", "buttfucker", "cabilla",
        "cabron", "cabrón", "cabrona", "caca", "Cachapera", "cagalera", "cagar",
        "caga", "cagante", "cagarla", "cagaste", "cagaste", "cagón", "cagon",
        "cagona", "cancer", "cáncer", "Carado", "caramonda", "caramono",
        "caremono", "caramondá", "caraculo", "careculo", "carepito", "carapito",
        "carapendejo", "carependejo", "castra", "castroso", "castrosa", "castrante",
        "chacha", "chachar", "chichar", "chichis", "chilote", "chinga", "chingar",
        "chingaste", "chingon", "chingón", "chingona", "chingues", "chinguisa",
        "chinguiza", "Chink", "Chinky", "chiquitingo", "chocha", "chój", "chucha",
        "chuchamadre", "chuj", "chupalo", "chúpalo", "chúpala", "chupala",
        "chwdp", "cipa", "cipo", "cochon", "cochón", "cock", "Cock", "Cocks",
        "Cocksucker", "cogas", "cojas", "coger", "cojete", "cojón", "cojon",
        "cochar", "coshar", "cocho", "comecaca", "comepollas", "comepoyas",
        "coñazo", "coñaso", "concha", "conchatumadre", "conchadetumadre",
        "conxetumare", "conxetumadre", "conxatumare", "conxatumadre",
        "conchetumare", "conchatumare", "coño", "creido", "creído", "creida",
        "creída", "cuca", "cueco", "Culo", "culea", "culear", "culera", "culero",
        "culiado", "culiada", "culiao", "culia", "culiad@", "culo", "Culo",
        "Cum", "Cunt", "cunts", "ctm", "csm", "Dick", "Dickhead", "Dicks",
        "encabrona", "encabronado", "encabronada", "emputar", "enputar",
        "emputo", "enputo", "empute", "emputado", "emputada", "enputado",
        "enputada", "encular", "Enculé", "enculer", "encula", "enculada",
        "enculado", "enculo", "estafador", "estafadora", "estupido", "estúpido",
        "estupida", "estúpida", "Faggot", "falkland", "falklands", "fucklands",
        "fuckland", "falangista", "fascista", "Fellatio", "fick", "fistfuck",
        "follada", "follar", "follo", "follón", "follon", "Fook", "Fooker",
        "Fooking", "Fotze", "follada", "foyada", "frei", "frijolero", "Fuck",
        "Fucker", "Fuckers", "Fucking", "Führer", "garcha", "gilipolla",
        "guatepeor", "jilipolla", "gachupín", "gachupin", "gilipoya",
        "jilipoya", "gonorrea", "guevon", "guevón", "guevona", "guey", "heil",
        "hideputa", "hijodeputa", "hijoputa", "hdp", "hitler", "Hitler",
        "hueva", "huevon", "huevón", "huevona", "HWDP", "idiota", "imbécil",
        "imbecil", "jalabola", "Japseye", "jeba&H107", "jebanie", "jebca",
        "jilipollas", "Jizz", "job", "jodan", "jodas", "jodaz", "joder",
        "jodido", "jodida", "joto", "joyo", "judenmutter", "judensöhne",
        "kaka", "caka", "kaca", "kabron", "kabrón", "kabrona", "Kike",
        "korwa", "kórwa", "kurwa", "kurwia", "kutas", "leck", "leche",
        "lexe", "m4nco", "macht", "maldito", "maldita", "malnacida",
        "Malnacido", "malparida", "malparido", "Malvinas", "mamada",
        "mamadas", "mamado", "mamalo", "mámalo", "mamarla", "mamaste",
        "mames", "mamón", "mamon", "mamona", "manco", "manko", "manca",
        "maraca", "Marica", "marico", "Maricon", "Maricón", "maricones",
        "maricona", "mariconas", "mariconson", "mariconsón", "mariconzón",
        "mariconzon", "mariqueta", "mariquis", "mayate", "meco", "mecos",
        "melgambrea", "merde", "mexicaca", "mejicaca", "mexicoño",
        "mejicoño", "mejicaño", "mexicaño", "mich", "mierda", "m1erda",
        "mierdero", "mondá", "monda", "Mong", "moraco", "motherfucker",
        "Motherfucking", "Nazi", "neger", "negrata", "Nègre", "negrero",
        "nekrofil", "Nigga", "Nigger", "niggers", "Niquer", "no mames",
        "odbyt", "odjeba&H142o", "ojete", "ogete", "pajear", "pajote",
        "Paki", "pakis", "panocha", "Paragua", "payaso", "payasa", "pecheche",
        "peda", "pederasta", "pedo", "pedota", "pedota", "pedofila",
        "pedófila", "pedofilo", "pedófilo", "pedón", "pendeja", "pendejear",
        "pendejo", "pendejos", "pendejas", "pelotudo", "pel0tud0",
        "pelotuda", "pel0tuda", "pene", "percanta", "perra", "Perucho",
        "pete", "pierdol", "pierdolic", "pierdolona", "Pinacate", "pinche",
        "pinches", "polla", "pollas", "polla", "putada","puta", "puto", "putos",
        "putos", "putón", "putona", "raja", "rajada", "rajón", "rajona",
        "raja", "roba", "robo", "rompenoche", "saco", "sala", "sota",
        "sotera", "sotero", "soto", "trabuco", "traga", "trage", "traigo",
        "traiga", "tristeza", "tristeza", "tronco", "tronco", "tu mamada",
        "tu madre", "tu hermano", "tú a tú", "vaca", "verga", "verga",
        "verguero", "verguero", "zorra", "zorrón", "zorrón", "zorrón","sexo","hijueputa"
        ,"vagina","bolas","picha")
}