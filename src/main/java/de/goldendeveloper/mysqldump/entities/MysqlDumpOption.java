package de.goldendeveloper.mysqldump.entities;

public class MysqlDumpOption {

    private final String cmd;
    private final String name;

    public MysqlDumpOption allDatabases = new MysqlDumpOption("all-Databases", "--all-Databases");
    public MysqlDumpOption allTableSpaces = new MysqlDumpOption("all-TableSpaces", "--all-tablespaces");
    public int noTableSpaces = 2;
    public int addDropDatabase =3;
    public int addDropTable = 4;
    public int addDropTrigger =5;
    public int addLocks = 6;
    public int allowKeywords = 7;
    public int applySlaveStatements = 8;
    public int characterSetsDir = 9;
    public int comments = 10;
    public int compatible = 11;
    public int compact = 12;
    public int completeInsert = 13;
    public int compress = 14;
    public int createOptions = 15;
    public int databases = 16;
    public int debugCheck = 17;
    public int debugInfo = 18;
    public int defaultCharacterSet = 19;//utf8mb4
    public int delayedInsert = 20;
    public int deleteMasterLogs = 21;
    public int disableKeys = 22;
    public int dumpSlave = 23;
    public int events = 24;
    public int extendedInsert = 25;
    public int fieldsTerminatedBy = 26;
    public int fieldsEnclosedBy = 27;
    public int fieldsOptionallyEnclosedBy = 28;
    public int fieldsEscapedBy = 29;
    public int flushLogs = 30;
    public int flushPrivileges = 31;
    public int force = 32;
    public int gtid = 33;
    public int hexBlob = 34;
    public int host = 35;
    public int includeMasterHostPort = 36;
    public int insertIgnore = 37;
    public int linesTerminatedBy = 38;
    public int lockAllTables = 39;
    public int lockTables = 40;
    public int logError = 41;
    public int logQueries = 42;
    public int masterData = 43;
    public int maxAllowedPacket = 44;
    public int netBufferLength = 45;
    public int noAutocommit = 46;
    public int noCreateDb = 47;
    public int noCreateInfo = 48;
    public int noData = 49;
    public int noDataMed = 50;
    public int orderByPrimary = 51;
    public int port = 52;
    public int quick = 53;
    public int quoteNames = 0;
    public int replace = 0;
    public int routines = 0;
    public int setCharset = 0;
    public int singleTransaction = 0;
    public int dumpDate = 0;
    public int socket = 0;              //var/run/mysqld/mysqld.sock
    public int ssl = 0;
    public int sslCa = 0;
    public int sslCapath = 0;
    public int sslCert = 0;
    public int sslCipher = 0;
    public int sslKey = 0;
    public int sslCrl = 0;
    public int sslCrlPath = 0;
    public int sslVerifyServerCert = 0;
    public int system = 0;
    public int tab = 0;
    public int triggers = 0;
    public int tzUtc = 0;
    public int user = 0;
    public int verbose = 0;
    public int where = 0;
    public int pluginDir = 0;
    public int defaultAuth = 0;

    public MysqlDumpOption(String name, String cmd) {
        this.name = name;
        this.cmd = cmd;
    }

    public String getName() {
        return name;
    }

    public String getCmd() {
        return cmd;
    }

    /*
    * Dumping structure and contents of MySQL databases and tables.
Usage: mysqldump [OPTIONS] database [tables]
OR     mysqldump [OPTIONS] --databases DB1 [DB2 DB3...]
OR     mysqldump [OPTIONS] --all-databases
OR     mysqldump [OPTIONS] --system=[SYSTEMOPTIONS]]

The following options may be given as the first argument:
--print-defaults          Print the program argument list and exit.
--no-defaults             Don't read default options from any option file.
The following specify which files/extra groups are read (specified before remaining options):
--defaults-file=#         Only read default options from the given file #.
--defaults-extra-file=#   Read this file after the global files are read.
--defaults-group-suffix=# Additionally read default groups with # appended as a suffix.

  -A, --all-databases Dump all the databases. This will be same as --databases with all databases selected.
  -Y, --all-tablespaces Dump all the tablespaces.
  -y, --no-tablespaces Do not dump any tablespace information.
  --add-drop-database Add a DROP DATABASE before each create.
  --add-drop-table    Add a DROP TABLE before each create. (Defaults to on; use --skip-add-drop-table to disable.)
  --add-drop-trigger  Add a DROP TRIGGER before each create.
  --add-locks         Add locks around INSERT statements. (Defaults to on; use --skip-add-locks to disable.)
  --allow-keywords    Allow creation of column names that are keywords.
  --apply-slave-statements Adds 'STOP SLAVE' prior to 'CHANGE MASTER' and 'START SLAVE' to bottom of dump.
  --character-sets-dir=name Directory for character set files.
  -i, --comments      Write additional information. (Defaults to on; use --skip-comments to disable.)
  --compatible=name   Change the dump to be compatible with a given mode. By
                      default tables are dumped in a format optimized for
                      MySQL. Legal modes are: ansi, mysql323, mysql40,
                      postgresql, oracle, mssql, db2, maxdb, no_key_options,
                      no_table_options, no_field_options. One can use several
                      modes separated by commas. Note: Requires MySQL server
                      version 4.1.0 or higher. This option is ignored with
                      earlier server versions.
  --compact           Give less verbose output (useful for debugging). Disables
                      structure comments and header/footer constructs.  Enables
                      options --skip-add-drop-table --skip-add-locks
                      --skip-comments --skip-disable-keys --skip-set-charset.
  -c, --complete-insert Use complete insert statements.
  -C, --compress      Use compression in server/client protocol.
  -a, --create-options Include all MySQL specific create options.
                      (Defaults to on; use --skip-create-options to disable.)
  -B, --databases     Dump several databases. Note the difference in usage; in
                      this case no tables are given. All name arguments are
                      regarded as database names. 'USE db_name;' will be
                      included in the output.
  -#, --debug[=#]     This is a non-debug version. Catch this and exit.
  --debug-check       Check memory and open file usage at exit.
  --debug-info        Print some debug info at exit.
  --default-character-set=name Set the default character set.
  --delayed-insert    Insert rows with INSERT DELAYED.
  --delete-master-logs Delete logs on master after backup. This automatically enables --master-data.
  -K, --disable-keys  '!40000 ALTER TABLE tb_name DISABLE KEYS ; and '!40000 ALTER TABLE tb_name ENABLE KEYS ; will be put in the output. (Defaults to on; use --skip-disable-keys to disable.)
            --dump-slave[=#]    This causes the binary log position and filename of the
    master to be appended to the dumped data output. Setting
    the value to 1, will printit as a CHANGE MASTER command
    in the dumped data output; if equal to 2, that command
    will be prefixed with a comment symbol. This option will
    turn --lock-all-tables on, unless --single-transaction is
    specified too (in which case a global read lock is only
            taken a short time at the beginning of the dump - don't
            forget to read about --single-transaction below). In all
    cases any action on logs will happen at the exact moment
    of the dump.Option automatically turns --lock-tables off.
            -E, --events        Dump events.
  -e, --extended-insert
    Use multiple-row INSERT syntax that include several
    VALUES lists.
            (Defaults to on; use --skip-extended-insert to disable.)
            --fields-terminated-by=name
    Fields in the output file are terminated by the given
    string.
  --fields-enclosed-by=name
    Fields in the output file are enclosed by the given
    character.
  --fields-optionally-enclosed-by=name
    Fields in the output file are optionally enclosed by the
    given character.
            --fields-escaped-by=name
    Fields in the output file are escaped by the given
    character.
  -F, --flush-logs    Flush logs file in server before starting dump. Note that
                      if you dump many databases at once (using the option
            --databases= or --all-databases), the logs will be
    flushed for each database dumped. The exception is when
    using --lock-all-tables or --master-data: in this case
    the logs will be flushed only once, corresponding to the
    moment all tables are locked. So if you want your dump
    and the log flush to happen at the same exact moment you
    should use --lock-all-tables or --master-data with
                      --flush-logs.
  --flush-privileges  Emit a FLUSH PRIVILEGES statement after dumping the mysql
    database.  This option should be used any time the dump
    contains the mysql database and any other database that
    depends on the data in the mysql database for proper
    restore.
  -f, --force         Continue even if we get an SQL error.
  --gtid              Used together with --master-data=1 or --dump-slave=1.When
    enabled, the output from those options will set the GTID
    position instead of the binlog file and offset; the
    file/offset will appear only as a comment. When disabled,
    the GTID position will still appear in the output, but
    only commented.
            --hex-blob          Dump binary strings (BINARY, VARBINARY, BLOB) in
    hexadecimal format.
            -h, --host=name     Connect to host.
            --ignore-database=name
    Do not dump the specified database. To specify more than
    one database to ignore, use the directive multiple times,
    once for each database. Only takes effect when used
    together with --all-databases|-A
  --ignore-table-data=name
    Do not dump the specified table data. To specify more
    than one table to ignore, use the directive multiple
    times, once for each table. Each table must be specified
    with both database and table names, e.g.,
            --ignore-table-data=database.table.
  --ignore-table=name Do not dump the specified table. To specify more than one
    table to ignore, use the directive multiple times, once
                      for each table.  Each table must be specified with both
    database and table names, e.g.,
            --ignore-table=database.table.
  --include-master-host-port
    Adds 'MASTER_HOST=<host>, MASTER_PORT=<port>' to 'CHANGE
    MASTER TO..' in dump produced with --dump-slave.
            --insert-ignore     Insert rows with INSERT IGNORE.
            --lines-terminated-by=name
    Lines in the output file are terminated by the given
    string.
  -x, --lock-all-tables
    Locks all tables across all databases. This is achieved
    by taking a global read lock for the duration of the
    whole dump. Automatically turns --single-transaction and
                      --lock-tables off.
            -l, --lock-tables   Lock all tables for read.
            (Defaults to on; use --skip-lock-tables to disable.)
            --log-error=name    Append warnings and errors to given file.
            --log-queries       When restoring the dump, the server will, if logging
    turned on, log the queries to the general and slow query
                      log.
                              (Defaults to on; use --skip-log-queries to disable.)
            --master-data[=#]   This causes the binary log position and filename to be
    appended to the output. If equal to 1, will print it as a
    CHANGE MASTER command; if equal to 2, that command will
    be prefixed with a comment symbol. This option will turn
                      --lock-all-tables on, unless --single-transaction is
    specified too (on servers before MariaDB 5.3 this will
            still take a global read lock for a short time at the
            beginning of the dump; don't forget to read about
            --single-transaction below). In all cases, any action on
    logs will happen at the exact moment of the dump. Option
    automatically turns --lock-tables off.
            --max-allowed-packet=#
    The maximum packet length to send to or receive from
    server.
  --net-buffer-length=#
    The buffer size for TCP/IP and socket communication.
            --no-autocommit     Wrap tables with autocommit/commit statements.
            -n, --no-create-db  Suppress the CREATE DATABASE ... IF EXISTS statement that
    normally is output for each dumped database if
            --all-databases or --databases is given.
  -t, --no-create-info
    Don't write table creation info.
            -d, --no-data       No row information.
            --no-data-med       No row information for engines that Manage External Data
            (MRG_MyISAM, MRG_ISAM, CONNECT, OQGRAPH, SPIDER, VP,
             FEDERATED).
            (Defaults to on; use --skip-no-data-med to disable.)
            -N, --no-set-names  Same as --skip-set-charset.
  --opt               Same as --add-drop-table, --add-locks, --create-options,
            --quick, --extended-insert, --lock-tables, --set-charset,
    and --disable-keys. Enabled by default, disable with
                      --skip-opt.
  --order-by-primary  Sorts each table's rows by primary key, or first unique
    key, if such a key exists.  Useful when dumping a MyISAM
    table to be loaded into an InnoDB table, but will make
    the dump itself take considerably longer.
            -p, --password[=name]
    Password to use when connecting to server. If password is
    not given it's solicited on the tty.
            -P, --port=#        Port number to use for connection.
  --protocol=name     The protocol to use for connection (tcp, socket, pipe,
                                                          memory).
            -q, --quick         Don't buffer query, dump directly to stdout.
            (Defaults to on; use --skip-quick to disable.)
            -Q, --quote-names   Quote table and column names with backticks (`).
            (Defaults to on; use --skip-quote-names to disable.)
            --replace           Use REPLACE INTO instead of INSERT INTO.
            -r, --result-file=name
    Direct output to a given file. This option should be used
    in systems (e.g., DOS, Windows) that use carriage-return
    linefeed pairs (\r\n) to separate text lines. This option
    ensures that only a single newline is used.
            -R, --routines      Dump stored routines (functions and procedures).
            --set-charset       Add 'SET NAMES default_character_set' to the output.
            (Defaults to on; use --skip-set-charset to disable.)
            --single-transaction
    Creates a consistent snapshot by dumping all tables in a
    single transaction. Works ONLY for tables stored in
    storage engines which support multiversioning (currently
                                                           only InnoDB does); the dump is NOT guaranteed to be
    consistent for other storage engines. While a
                      --single-transaction dump is in process, to ensure a
    valid dump file (correct table contents and binary log
            position), no other connection should use the following
    statements: ALTER TABLE, DROP TABLE, RENAME TABLE,
    TRUNCATE TABLE, as consistent snapshot is not isolated
    from them. Option automatically turns off --lock-tables.
  --dump-date         Put a dump date to the end of the output.
            (Defaults to on; use --skip-dump-date to disable.)
            --skip-opt          Disable --opt. Disables --add-drop-table, --add-locks,
            --create-options, --quick, --extended-insert,
            --lock-tables, --set-charset, and --disable-keys.
  -S, --socket=name   The socket file to use for connection.
  --ssl               Enable SSL for connection (automatically enabled with
            other flags).
            --ssl-ca=name       CA file in PEM format (check OpenSSL docs, implies
                      --ssl).
            --ssl-capath=name   CA directory (check OpenSSL docs, implies --ssl).
            --ssl-cert=name     X509 cert in PEM format (implies --ssl).
            --ssl-cipher=name   SSL cipher to use (implies --ssl).
            --ssl-key=name      X509 key in PEM format (implies --ssl).
            --ssl-crl=name      Certificate revocation list (implies --ssl).
            --ssl-crlpath=name  Certificate revocation list path (implies --ssl).
            --ssl-verify-server-cert
    Verify server's "Common Name" in its cert against
    hostname used when connecting. This option is disabled by
    default.
            --system=name       Dump system tables as portable SQL. Any combination of:
    all, users, plugins, udfs, servers, stats, timezones
  -T, --tab=name      Create tab-separated textfile for each table to given
                      path. (Create .sql and .txt files.) NOTE: This only works
                      if mysqldump is run on the same machine as the mysqld
    server.
  --tables            Overrides option --databases (-B).
            --triggers          Dump triggers for each dumped table.
            (Defaults to on; use --skip-triggers to disable.)
            --tz-utc            SET TIME_ZONE='+00:00' at top of dump to allow dumping of
    TIMESTAMP data when a server has data in different time
    zones or data is being moved between servers with
    different time zones.
            (Defaults to on; use --skip-tz-utc to disable.)
            -u, --user=name     User for login if not current user.
  -v, --verbose       Print info about the various stages.
  -V, --version       Output version information and exit.
            -w, --where=name    Dump only selected records. Quotes are mandatory.
  -X, --xml           Dump a database as well formed XML.
            --plugin-dir=name   Directory for client-side plugins.
            --default-auth=name Default authentication client-side plugin to use.

    Variables (--variable-name=value)
    and int options {0;|0;}  Value (after reading options)
--------------------------------- ----------------------------------------
    all-databases                     0;
    all-tablespaces                   0;
    no-tablespaces                    0;
    add-drop-database                 0;
    add-drop-table                    0;
    add-drop-trigger                  0;
    add-locks                         0;
    allow-keywords                    0;
    apply-slave-statements            0;
    character-sets-dir                0;
    comments                          0;
    compatible                        0;
    compact                           0;
    complete-insert                   0;
    compress                          0;
    create-options                    0;
    databases                         0;
    debug-check                       0;
    debug-info                        0;
    default-character-set             utf8mb4
    delayed-insert                    0;
    delete-master-logs                0;
    disable-keys                      0;
    dump-slave                        0
    events                            0;
    extended-insert                   0;
    fields-terminated-by              0;
    fields-enclosed-by                0;
    fields-optionally-enclosed-by     0;
    fields-escaped-by                 0;
    flush-logs                        0;
    flush-privileges                  0;
    force                             0;
    gtid                              0;
    hex-blob                          0;
    host                              0;
    include-master-host-port          0;
    insert-ignore                     0;
    lines-terminated-by               0;
    lock-all-tables                   0;
    lock-tables                       0;
    log-error                         0;
    log-queries                       0;
    master-data                       0
    max-allowed-packet                16777216
    net-buffer-length                 1046528
    no-autocommit                     0;
    no-create-db                      0;
    no-create-info                    0;
    no-data                           0;
    no-data-med                       0;
    order-by-primary                  0;
    port                              0
    quick                             0;
    quote-names                       0;
    replace                           0;
    routines                          0;
    set-charset                       0;
    single-transaction                0;
    dump-date                         0;
    socket                            /var/run/mysqld/mysqld.sock
    ssl                               0;
    ssl-ca                            0;
    ssl-capath                        0;
    ssl-cert                          0;
    ssl-cipher                        0;
    ssl-key                           0;
    ssl-crl                           0;
    ssl-crlpath                       0;
    ssl-verify-server-cert            0;
    system
    tab                               0;
    triggers                          0;
    tz-utc                            0;
    user                              0;
    verbose                           0;
    where                             0;
    plugin-dir                        0;
    default-auth                      0;

    * */
}
